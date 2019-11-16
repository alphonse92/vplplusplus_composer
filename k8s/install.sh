#!/bin/bash
ENVIRONMENT_PATH='environments'
SERVICES_PATH="services"
NAMESPACES_PATH="namespaces"
files=$(ls $NAMESPACES_PATH)
services=$(ls $SERVICES_PATH)
environments=(development production)
echo "1. Try to create namespaces"

for namespace in $files ;
do
  PATH_TO_NAMESPACE_SPEC="$NAMESPACES_PATH/${namespace}";
  kubectl create -f $PATH_TO_NAMESPACE_SPEC >> /dev/null;
done

echo "2. Compile services spec" 

for service in $services ;
do
  
  SERVICE_ENV_PATH="$ENVIRONMENT_PATH/$service"
  
  for environment in $environments ; 
  do
   
    ./compile.sh "$service"  "$environment.yaml"
  
  done

done
