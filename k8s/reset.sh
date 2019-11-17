#!/bin/bash
SERVICES_PATH="services"
services=$(ls $SERVICES_PATH)
environments=(development production)

echo "1. Compile and delete objects" 

for service in $services ;
do 
  for env in ${environments[@]} ; 
  do
    ./delete_service.sh $service $env
    echo ""
  done

done


echo "2. Try to delete namespaces"

kubectl delete -f namespaces