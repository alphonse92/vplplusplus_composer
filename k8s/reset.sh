#!/bin/bash

services=$(ls $SERVICES_PATH)
environments=(development production)

echo "1. Compile and delete objects" 

for service in $services ;
do
  
  SERVICE_ENV_PATH="$ENVIRONMENT_PATH/$service"
  
  for env in ${environments[@]} ; 
  do
    ./delete_service $service $env
  done

done


echo "2. Try to delete namespaces"

kubectl delete -f namespaces