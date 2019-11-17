#!/bin/bash

environments=(development production)
services=$(ls $SERVICES_PATH)

echo "1. Try to create namespaces"

kubectl create -f namespaces

echo "2. Compile and deploy services" 

for service in $services ;
do  
  for env in ${environments[@]} ; 
  do
   ./create_service $service $env
  done
done



