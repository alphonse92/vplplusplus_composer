#!/bin/bash
SERVICES_PATH="services"
services=$(ls $SERVICES_PATH)
ENV_PARAM=$1
environments=(development production)

echo "1. Stoping ..." 


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

