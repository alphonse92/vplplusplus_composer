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
    # The start order is very important
    ./create.sh "$service" "$env" "pv"
    ./create.sh "$service" "$env" "pvc"
    ./create.sh "$service" "$env" "configMap"
    ./create.sh "$service" "$env" "deployment"
    ./create.sh "$service" "$env" "service"
  
  done

done



