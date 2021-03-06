#!/bin/bash
SERVICES_PATH="services"
environments=(development production)
services=$(ls $SERVICES_PATH)
ENV_PARAM=$1

echo "1. Try to create namespaces"

kubectl create -f namespaces
echo "" 
echo "2. Compile and deploy services" 

for service in $services ;
do  

  if [ -z "$ENV_PARAM"];
  then
    for env in ${environments[@]} ; 
    do
    ./create_service.sh $service $env
    echo ""
    done
  else
    ./create_service.sh $service $ENV_PARAM
  fi

  
done



