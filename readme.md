# Vpl Composer

This is the root project of all Vpl ++ microservices

## Requeriments

1. Docker
2. Docker Compose
3. Kubernetes (if you want to deploy to kubernetes)
4. Python 3
5. Jinja (j2cli using pip)

## Install 

`git clone git@github.com:alphonse92/vplplusplus_composer.git`

`./intall.sh`

## Configuration 

1. Open the  docker-compose.deployment.example.yaml 
2. change the environment variables as you need

To know how to configure the other microservices please visit each microservice repository:

### Repositories

##### Microservice repositories

1. [VPL++ API microservice](https://github.com/alphonse92/vplplusplus_api)
2. [Jail With JLib Runner microservice](https://github.com/alphonse92/vplplusplus_jail_jlib) 
3. [VPL++ Client microservice](https://github.com/alphonse92/vplplusplus_client) 
4. [Moodle microservice](https://github.com/alphonse92/docker-moodle) 
5. [Gateway microsevice](https://github.com/alphonse92/vplplusplus_gateway)
   
##### Other repositories

1. [Docker vpl Jail microservice](https://github.com/alphonse92/vplplusplus_jail)
1. [Vpl ++ Java Runner](https://github.com/alphonse92/vplplusplus_jlib)

##### External projects:

1. [Mongo](https://hub.docker.com/_/mongo)
2. [Mysql](https://hub.docker.com/_/mysql)

## Deploying

### Docker compose

Run `docker-compose up`

### Localhost

Run `docker-compose up`

There a issue regarding to how moodle and vpl works. When the student or the teacher tries to execute a VPL activity it happen in two phases:

1. Send the activity to moodle. Return a websocket with the url to the jail to track the process of the execution
2. The browser tries to connect to the jail.

However, the browser cant reach the jail URL because it returns a docker internal IP.

![issue](docs/images/diagrams/components/localhost jail issue.png?raw=true)


3. Open the file /etc/hosts/ 
4. Add to the end of document the next line `127.0.0.1 jail`
5. Flush the dns cache  `sudo dscacheutil -flushcache`

To test all is ok, just open the browser and open `http://jail:$JAIL_PORT/OK`  

### Kubernetes (K8S)

Please visit the guide of [kubernetes deployment](k8s.md)

# Extending VPL to VPL++

VPL is the easy way to manage programming assignments in Moodle.

Its features of editing, running and evaluation of programs makes learning process for students, and the evaluation task for teachers, easier than ever.

[More info](https://vpl.dis.ulpgc.es/)

## Vpl original approach

At first look the vpl works using 3 differents components and works together each other.
The firs one is the VPL plugin for moodle, it sends some data to the Vpl Jail execution server. The second is the Vpl jail execution server, it only executes the teacher and student code safelly in a isolate environment. The las one is the client (frontend). It allow to the students and teachers to writte code.


### Vpl Client - Frontend.

It allows to the students create them code. That code will be tested by the teachers, they can write some tests to grade the students summaries. Also, the teacher can modify the execution to get more control on the student code that him sends as a summary.

##### Responsabilities:

- Provide a gui to writte code
- Comunicate the inputs to the Moodle VPL plugin
- Allow to the teachers create, modify, test and more on him activity
- Allow to the students to write code in the browser.

### Vpl Moodle plugin

It is integrated in the moodle platform. The plugin receive and process the data sended by the client. Also, the plugin act as bridge between the client and the execution jail.

##### Responsabilites

- Comunicate the client with the jail execution
- Process the moodle activites data


### Vpl Jail Execution Server

It is the component which excute the student and teacher code. It provides a isolate container to execute them code safelly without colateral damage. 

##### Responsabilites

- Run the student and teacher code
- Isolate the code execution
- Provide a layer to execute code safelly
- Rpc server

The combination of all of these services is that we called VPL. 

## Workflow

Before start to talk about the workflow, we need to know some related terms that will help us to understand the process easilly.

#### Execution files

The executions files are all the files that are sended by the teachers and the students. Normally a vpl submisions has students summaries and teachers summaries. However, the teacher can send all the files that him wanted to send. For example, the teacher is able to send a shell script to log something. 

Following that ideas, the execution files are:

1. Students code.
2. Teacher execution scripts code.
3. Teacher extra scripts to do something.

#### Execution scripts

Vpl always sends several execution files, lets call those as `Execution scripts`. Those scripts are responsible to get control of the execution flow in vpl jail. 

Those executions are postfixed by `_run.sh`, `_debug.sh` and `_evaluate.sh` by language and  purpose. For example,  java_run.sh has all the instructions to **run** **java** programs. In another hand, the script `java_evaluate.sh` has all the instructions to **evaluate java** programs. The same apply to the  java_debug.sh 

You can see the scripts that the Moodle plugin sends to the jail at: `moodle_installation_folder/mod/vpl/jail/default_scripts/`. 

The combination of those scripts allows to the jail understand the execution.

#### Vpl_submission_CE Class
 You can find that file at: 
`moodle_installation_folder/mod/vpl/vpl_submission_CE.class.php`. 

The vpl_submission_CE.class.php is who sends the scripts to the Jail. The class checks if the teacher write him own execution script. If not, the class will send a default script. Those execution scripts are:

1. $lang_run.sh if teacher sends or default_run.sh
2. $lang_debug.sh if teacher sends or default_debug.sh
3. $lang_evaluate.sh if teacher sends or default_evaluate.sh
4. $lang_evaluate.cases if exists
5. Any file that the teacher adds to the execution files. 
  For example `teacher-script-to-log-something.sh`

The seconds are used to control the execution in the jail, and the teacher can’t override those, the mentioned scripts are:

1. common_script.sh
2. vpl_environment.sh

The last is created programatically by the class and it set several information about the execution. In this shell script the class will set the executions options for the activity, including the Moodle user id. 

All of this happen in ```Vpl_submission_CE.prepare_execution``` instance method.

### 1. The client

The vpl moodle client just is a interface that comunicate to vpl plugin.

#### Teacher 

At first, the teacher prepare him activities and post that in him course. Configure and manage as him needs. After he post it, the students can participate in the teacher activity. 

The teacher can add execution files to control the execution in the jail server.

#### Student

The student can join in a course and participate in the vpl activities that was posted by the teacher. The vpl client prepare a gui to allow to him to write code. After the student finish, he sends the code and vpl executes or not (if the teacher disable this feature) the code.


### 2. The Moodle plugin

We will focus on the student submission execution process, instead of the communication with moodle.

1. After the student sends the vpl activity submissions, vpl reads the execution scripts, and sends it to the vpl jail via rpc. 
2. The jail returns a open socket.
3. Create a url to the Vpl socket for that executions and return it to the client.
4. Returns the socket to the client.
5. After the vpl finish the executions, grade the activity and store the results


### 3. Vpl Jail Execution Server

The jail does not construct any script, just receive the scripts from the vpl plugin and execute it. 

1. The Jail gets the code and execute it.
2. Open a socket and send it to the plugin.
3. While is the scripts are beign executed, it sends the output to the vpll plugin. 
4. When the execution is finished, the socket is closed

## Extending the workflow