#!/bin/bash
SERVICES_PATH="services"
environments=(development production)
services=$(ls $SERVICES_PATH)

echo "1. Try to create namespaces"

kubectl create -f namespaces
echo "" 
echo "2. Compile and deploy services" 

for service in $services ;
do  
  for env in ${environments[@]} ; 
  do
   ./create_service.sh $service $env
   echo ""
  done
done



