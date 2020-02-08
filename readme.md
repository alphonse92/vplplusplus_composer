# Vpl ++ Microservices

This repository contains all the stuff to install the microservices

| nombre           | url                        |
|------------------|----------------------------|
| VPL ++ front end | https://35.198.14.0/       |
| Moodle con VPL   | https://35.198.14.0/client |

## Requeriments

1. Docker
2. Docker Compose
3. Kubernetes (if you want to deploy to kubernetes)
4. Python 3
5. Jinja (j2cli using pip)

### Not required but usefull tools:

1. Mongo client: if you want to change or read the api data from scratch **(It may be dangerous)**. 
2. Mysql client: if you want to change pr read the moodle data from scratch **(It may be dangerous)**. 

## Install 

```sh 
git clone git@github.com:alphonse92/vplplusplus_composer.git
./intall.sh
```

## Configuration 

1. Open the  docker-compose.deployment.yaml 
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

There a issue regarding to how moodle and vpl works. When the student or the teacher tries to execute a VPL activity it happen in two phases

1. Send the activity to moodle. Return a websocket with the url to the jail to track the process of the execution
2. The browser tries to connect to the jail.

However, the browser cant reach the jail URL because it returns a docker internal IP.

![issue](/docs/images/diagrams/components/localhostjailissue.png?raw=true "issue")

To resolve this issue, you need to ensure your PC can reach the jail.

1. Open the file /etc/hosts/ 
2. Add to the end of document the next line `127.0.0.1 jail`
3. Flush the dns cache  `sudo dscacheutil -flushcache`

To test all is ok, just open the browser and open `http://jail:$JAIL_PORT/OK`  

### Kubernetes (K8S)

Please visit the guide of [kubernetes deployment](k8s.md)
