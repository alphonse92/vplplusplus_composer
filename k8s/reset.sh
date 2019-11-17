#!/bin/bash
ENVIRONMENT_PATH='environments'
SERVICES_PATH="services"
NAMESPACES_PATH="namespaces"
BUILD_PATH="build"
files=$(ls $NAMESPACES_PATH)
services=$(ls $SERVICES_PATH)
environments=(development production)


echo "1. Compile and delete objects" 

for service in $services ;
do
  
  SERVICE_ENV_PATH="$ENVIRONMENT_PATH/$service"
  
  for env in ${environments[@]} ; 
  do
    DEPLOYMENT_PATH="$BUILD_PATH/$service/$env"
    ./compile.sh "$service"  "$env"
    # The start order is very important
    ./stop.sh "$service" "$env" "service"
    ./stop.sh "$service" "$env" "deployment"
    ./stop.sh "$service" "$env" "configMap"
    ./stop.sh "$service" "$env" "pv"
    ./stop.sh "$service" "$env" "pvc"
  done

done


echo "2. Try to delete namespaces"

kubectl delete -f namespaces