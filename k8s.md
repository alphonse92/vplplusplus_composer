# Deploying in Kubernetes

## Advisory 

1. This guide does not provide information about how to configure the microservices.
2. This guide does not explain any command of [Kuberntes (k8s)](https://kubernetes.io/)

## Description

This is a guide to delploy the cluster easily, if you are a expermiented developer, you can deploy it by your hand. This repo contains some scripts to create, delete, or reload services with a few parameters.

At first, go to k8s folder. There is 6 services: mysql, mongo, client, api, jail and gateway. All of those are the microservices of this project. The subfolders of `environments` and `services` should be match each other.


![environment and service relationship](/docs/images/diagrams/k8sfilesrelationship.jpeg?raw=true "environment and service relationship")

Before start, you need to know how to configure each microservice. If you dont know how do it, visit the microservices pages documentation.

Available microservices 

1. [VPL++ API microservice](https://github.com/alphonse92/vplplusplus_api)
2. [Jail With JLib Runner microservice](https://github.com/alphonse92/vplplusplus_jail_jlib) 
3. [VPL++ Client microservice](https://github.com/alphonse92/vplplusplus_client) 
4. [Moodle microservice](https://github.com/alphonse92/docker-moodle) 
5. [Gateway microsevice](https://github.com/alphonse92/vplplusplus_gateway)
   
**You must not modify any file or folder in `services` folder**

## How to

This chapter describe how to do some tasks in the cluster with the vpl k8s scripts

### Compile the configuration

*You should compile the configuration files once, or every you change your environment variables*

Run `./compile.sh $SERVICE_NAME $NAMESPACE` , which $SERVICE_NAME should be the name of a microservice name (mysql, mongo, client, api, jail, gateway). That command will take the service template in `services` folder and replace the variables using your configuration. files at `./environment/` files.

After run, this command should create a `build` folder in `k8s` folder.

### Create Secrets

Some microservices such gateway, moodle or jail needs a certificate or certificate authority if the clusters is behind of SSL of it tries to reach a microservice behind a SSL. 

Maybe you will need to setup the next secrets on follow microservices acording to your configurations requirements:

1. Gateway CERTIFICATES: needs `gateway-development-certificates` with the crt and the key.
2. Moodle CACERT: needs `moodle-development-certificates` with certificate authority 
3. Jail CACERT: needs `jail-development-certificates` with certificate authority 
4. Jail HOST FILE: needs `jail-development-configuration` with a host file.

The certificate authority (cacert) is provided by the company that provide your certificates.

For example

`kubectl create secret generic gateway-development-certificates --namespace=development --from-file "./cert.crt" --from-file "./cert.key"`

If you need to delete one of them, run:

`kubectl delete secret gateway-development-certificates`


### Deploy a single kubernetes object

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

### Deploy a service

1. Compile the configuration of the service.
2. Run `./create_service.sh $YOUR_SERVICE $YOUR_NAMESPACE`. For example `./create_service.sh mysql development`

Some services take several minutes to be ok, so you need to wait the ok status of your cluster to continue deploying services in your cluster

To delete a service run:

`./delete_service.sh $SERVICE $NAMESPACE`

### Reload a service

If you want to change environments variables of a service and deploy the service inmediately, run:

`./reload.sh $SERVICE $NAMESPACE` it just delete the configmap and deployment objects, after it upload the new configmap and deployment objects.

# Steps to deploy the cluster

Before start, **Read the documentation of each Microservice and make sure you know how to configure each of them!** if you are behind SSL, remember to create the respective secrets for each microservice.

## 1. Create Namespaces

By default exists only two namespaces: `developent` and `production`. From now, i will explain the process to deploy `development`, however is the same to production. 

Of course, you can create another namespaces, just add a new regular namespace kubernetes configuration called as your namespace to the folder `namespaces`

Run `kubectl create -f namespaces` to create the namespaces in your cluster

### Set your configuration files of a service

The `environments` folder has the configuration of each service of each namespace. For example, the configuration files of mysql are in `environments/mysql` folder. Each file of each service folder should match with a namespace. For example, for the environment `staging` should have a configuration file called `environments/mysql/staging.yaml`

You can create the configuration files using the `.example` file.

**WARNING You DONT need to change the variables that resolves services each others.**

For example, you dont need to change the variable `DB_HOST` because kubernetes resolve the mysql database internally to the service `mysql-service-development`. Of course, you **CAN** change those variables in several situations, for example if you have a service outside the cluster.

1. Copy the file `.example` and change it name with the namespace related to this configuration (included the namespaces that you create by you own). For example, if you have a namespace called `staging`, you need to copy the `.example` file and change it name to `staging`
2. Open and change the values of each namespace configuration file for the service.

### 2. Deploy the databases

At first we need to create the database because the other services depends of it. If you want, you could connect to the databases from database managers or commandline with mongo or mysql tools.

### Deploy mysql database

1. Compile the configuration file of mysql with the namespace that you want to deploy for
2. Upload the service as `Upload a service` title said, running for example `./create_service.sh mysql $NAMESPACE`
3. Check your cluster status

### Deploy Mongo database

1. Compile the configuration file of mongo with the namespace that you want to deploy for
2. Upload the service as `Upload a service` title said, running for example `./create_service.sh mongo $NAMESPACE`
3. Check your cluster status

### 3. Deploy Moodle

1. Compile the configuration file of mongo with the namespace that you want to deploy for
2. Upload the service as `Upload a service` title said, running for example `./create_service.sh moodle $NAMESPACE`
3. Check your cluster status
4. Right now the service moodle is miss-configured, because we need to update the moodle variable called `MOODLE_URL`. If you want to know if moodle is running well, curl to the endpoint service.

### 4. Deploy the jail

As you noticed, the `ENV` value of jail configuration variable is setted to production. That changes the behaivor of the jail and it not afects the cluster.

1. Compile the configuration file of jail with the namespace that you want to deploy for
2. Upload the service as `Upload a service` title said, running for example `./create_service.sh jail $NAMESPACE`
3. Check your cluster status
4. Right now the service jail is miss-configured, because we need to update several environment variables regarding to another services. If you want to know if jail is running well, curl to the endpoint service.

### 5. Deploy the API

**Dont forget  set the database credentials in the API env config vars.**

1. Compile the configuration file of api with the namespace that you want to deploy for
2. Deploy the service as `Upload a service` title said, running for example `./create_service.sh api $NAMESPACE`
3. Check your cluster status

### 6. Deploy the Vpl ++ Web Client

**Please set your google application key in the client configuration file to able to login with google accounts**

1. Compile the configuration file of client with the namespace that you want to deploy for
2. Deploy the service as `Upload a service` title said, running for example `./create_service.sh client $NAMESPACE`
3. Check your cluster status
4. Right now the service client is miss-configured, because we need to update several environment variables regarding to another services.

### 7. Deploy the gateway

This steps changed a little. Because we need to deploy the `service object` at first, in order to get the external IP from it.

1. Compile the configuration file of gateway with the namespace that you want to deploy for
2. Deploy the service running: `./create_service gateway $NAMESPACE`
3. Get the external IP from the kubernetes service object for gateway service
4. Update the configuration file, change the value of `SERVER_NAME` with the external IP
5. Update the service following the instructions in the `reload a service` title. Run: `./reload.sh gateway $NAMESPACE`

### 8. Update the services variables that uses urls

For now, we deployed the cluster successfully. However is not at all, some services need to resolve external urls or microservices urls. For example: the client will need to resolve the API url. Also moodle need to resolve it own url. Also, the Jail need to resolve the API internally

To do it we need to modify the configuration files with the appropriate configuration.

**BEFORE START** get the gateway external IP. 

**REMEMBER** the gateway resolves paths for each microservice. Those paths are described in the next environment variables of the gateway (see the configuration file of the gateway or check [Gateway documentation](https://github.com/alphonse92/vplplusplus_gateway)):

1. JAIL_PATH
2. CLIENT_PATH
3. CLIENT_STATIC_PATH
4. API_PATH
5. MOODLE_PATH

The service url are formed by: `$PROTOCOL://$IP_OR_DOMAIN_NAME:$PORT/$SERVICE_PATH`

#### Gateway 

1. Open your configuration file of the gateway (remember, the **namespace** matters)
2. Set the value of `SERVER_NAME` with the gateway external IP
3. Reload the service. Run: `./reload.sh gateway $NAMESPACE` 

#### Moodle

1. Open your configuration file of moodle (remember, the **namespace** matters)
2. Set the value of `MOODLE_URL`  with the gateway path to the service
3. Reload the service. Run: `./reload.sh moodle $NAMESPACE`
4. Open the browser and try lookup for the service path. You should be able to acces to the moodle webpage.

#### Vpl++ Web Client

1. Open your configuration file of the client (remember, the **namespace** matters)
2. Set the value of `REACT_APP_API_BASEURL`  with the gateway url for the api
3. Reload the service. Run: `./reload.sh client $NAMESPACE`
4. Open the browser and try to login. If you dont already have configured moodle, the login will fail but you can see the request to the api using the gateway in the browser inspector.

#### Jail

**You need to create an api token for the jail, in order to allow to request to the appropiate endpoints**

1. Open your configuration file of the client (remember, the **namespace** matters)
2. In this case you need to set the appropiate value of `API_URL` variable. Also, you need to set the value of `API_TOKEN`. You can update one of this at different times.
3. Reload the service. Run: `./reload.sh jail $NAMESPACE`