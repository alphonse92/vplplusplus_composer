#!/bin/bash
ENVIRONMENT_PATH='environments'
SERVICES_PATH="services"
NAMESPACES_PATH="namespaces"
BUILD_PATH="build"
files=$(ls $NAMESPACES_PATH)
services=$(ls $SERVICES_PATH)
environments=(development production)

echo "1. Try to create namespaces"

kubectl create -f namespaces

echo "2. Compile and deploy services" 

for service in $services ;
do
  
  SERVICE_ENV_PATH="$ENVIRONMENT_PATH/$service"
  
  for env in ${environments[@]} ; 
  do
   
    DEPLOYMENT_PATH="$BUILD_PATH/$service/$env"
    ./compile.sh "$service"  "$env"
    kubectl create -f "$DEPLOYMENT_PATH"
  
  done

done



