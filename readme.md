# Vpl Composer

This is the root project of all Vpl ++ microservices

## Install 

`git clone git@github.com:alphonse92/vplplusplus_composer.git`

`./intall.sh`

## Configuration 

1. Open the  docker-compose.deployment.example.yaml 
2. change the environment variables as you need

To know how to configure the other microservices please visit the next webpages:

### Repositories

##### Microservice repositories

1. [VPL++ API microservice](https://github.com/alphonse92/vplplusplus_api)
2. [Jail With JLib Runner microservice](https://github.com/alphonse92/vplplusplus_jail_jlib) 
3. [VPL++ Client microservice](https://github.com/alphonse92/vplplusplus_client) 
4. [Moodle microservice](https://github.com/alphonse92/docker-moodle) 

##### Other repositories

1. [Docker vpl Jail microservice](https://github.com/alphonse92/vplplusplus_jail)
1. [Vpl ++ Java Runner](https://github.com/alphonse92/vplplusplus_jlib)

##### External projects:

1. [Mongo](https://hub.docker.com/_/mongo)
2. [Mysql](https://hub.docker.com/_/mysql)

### Networking

For default, all microservices uses the vpl network. You could create it using docker. When you use it, you need to resolve in your phisical machine the Jail hostname. 

1. Open the file /etc/hosts/ 
2. Add to the end of document the next line `127.0.0.1 jail`
3. Flush the dns cache  `sudo dscacheutil -flushcache`

To test all is ok, just open the browser and open `http://jail:9999/OK` (The port is the same that `docker-compose.deployment.example.yaml`). It should return an "OK"

  
## Running

`docker-compose -f docker-compose.deployment.example.yaml up`


## Deploying in cluster

At first, go to k8s folder. There is 6 services: mysql, mongo, client, api, jail and gateway. All of those are the microservices of this project. The subfolders of `environments` and `services` should be match each other.

**You must not modify any file or folder in `services` folder**

### Configure the services

#### Namespaces

By default exists only two namespaces: `developent` and `production`. From now, i will explaint the process to deploy `development`, however is the same to production. 

Of course, you can create another namespaces, just add a new regular namespace kubernetes configuration with your namespace to the folder `namespaces`

Run `kubectl create -f namespaces` to create the namespaces in your cluster

#### Set your configuration files of a service

The `environments` folder has the configuration of each service of each namespace. For example, the configuration files of mysql are in `environments/mysql` folder. Each file of each service folder should match with a namespace. For example, for the environment `staging` should have a configuration file called `environments/mysql/staging.yaml`

You can create the configuration files using the `.example` file.

**WARNING You DONT need to change the variables that resolves services each others.**

For example, you dont need to change the variable `DB_HOST` because kubernetes resolve the mysql database internally to the service `mysql-service-development`. Of course, you **CAN** change those variables in several situations, for example if you have a service outside the cluster.

1. Copy the file `.example` and change it name with the namespace related to this configuration (included the namespaces that you create by you own). For example, if you have a namespace called `staging`, you need copy the `.example` file and change it name to `staging`
2. Open and change the values of each namespace configuration file for the service.

#### Compile the configuration

*You should compile the configuration files once, or every you change your environment variables*

Run `./compile.sh $SERVICE_NAME $ENVIRONMENT` , which $SERVICE_NAME should be the name of a microservice name (mysql, mongo, client, api, jail, gateway). That command will take the service template in `services` folder and replace the variables using your environment files.

After run this command should create a `build` folder in `k8s` folder.


#### Deploy a single kubernetes object

Kubernetes object could be a namespace, deployment , persistent volume , persistent volume claim o service. The kubernetes service object is different that `service` that we are talking about. When i said `service` is regarding to a microservice, a `service object` is a kubernetes service object. [More info](https://kubernetes.io/docs/tutorials/services/)

You can see the current objects for a service in `services` folder. For example, the objects from mysql are in `services/mysql`. And there are 5 objects: 

1. configmap: configmap file
2. eployment: deployment file
3. pv: persistent volume file
4. pvc: persistent volume file
5. service: service file

The name of each files is meaninfull, it means the file name does not matter for kubernetes, but for we.

If you want deploy a single kubernetes object follow the next steps:

1. Compile the configuration
2. Run `./create_object.sh  $SERVICE $NAMESPACE $OBJECT` where $SERVICE is the service name (remember, the microservice name), $NAMESPACE the namespace, and $OBJECT is the name of the file of the kubernetes object that are you trying to deploy

For example:

If you want to deploy the `persistent volume` of `mysql` in the namespace `development` you need to run:

`./create_object.sh  mysql development pv`

to delete a object run:

`./delete_object.sh  $SERVICE_NAME $NAMESPACE $OBJECT`

#### Reload a service

If you want to change environments variables of a service and deploy the service inmediately, run:

`./reload.sh $SERVICE $NAMESPACE` it just delete the configmap and deployment objects, after it upload the new configmap and deployment objects.

#### Deploy a service

1. Compile the configuration of the service (see the title above).
2. Run `./create_service.sh $YOUR_SERVICE $YOUR_NAMESPACE`. For example `./create_service.sh mysql development`

Some services take several minutes to be ok, so you need to wait the ok status of your cluster to continue deploying services in your cluster

To delete a service run:

`./delete_service.sh $SERVICE $NAMESPACE`

### 1. Deploy the databases

At first we need to create the database because the other services depends of it. If you want, you could connect to the databases from database managers or commandline with mongo or mysql tools.

#### Deploy mysql database

1. Compile the configuration file of mysql with the namespace that you want to deploy for
2. Upload the service as `Upload a service` title said, running for example `./create_service.sh mysql $NAMESPACE`
3. Check your cluster status

#### Deploy Mongo database

1. Compile the configuration file of mongo with the namespace that you want to deploy for
2. Upload the service as `Upload a service` title said, running for example `./create_service.sh mongo $NAMESPACE`
3. Check your cluster status

### 2. Deploy Moodle

1. Compile the configuration file of mongo with the namespace that you want to deploy for
2. Upload the service as `Upload a service` title said, running for example `./create_service.sh moodle $NAMESPACE`
3. Check your cluster status
4. Right now the service moodle is miss-configured, because we need to update the moodle variable called `MOODLE_URL`. If you want to know if moodle is running well, curl to the endpoint service.

### 3. Deploy the jail

As you noticed, the `ENV` value of jail configuration variable is setted to production. That changes the behaivor of the jail and it not afects the cluster.

1. Compile the configuration file of mongo with the namespace that you want to deploy for
2. Upload the service as `Upload a service` title said, running for example `./create_service.sh jail $NAMESPACE`
3. Check your cluster status
4. Right now the service jail is miss-configured, because we need to update several environment variables regarding to another services. If you want to know if jail is running well, curl to the endpoint service.

### 4. Deploy the API

Dont forget  set the database credentials in the API env config vars.

1. Compile the configuration file of mongo with the namespace that you want to deploy for
2. Upload the service as `Upload a service` title said, running for example `./create_service.sh api $NAMESPACE`
3. Check your cluster status


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

