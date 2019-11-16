#!/bin/bash

SERVICE=$1
ENVIRONMENT=$2
OUTPUT="./build/$SERVICE/$ENVIRONMENT"
SERVICE_FILES=(configMap deployment pv pvc service)

if [ -z "$SERVICE" ];then
  echo "Please set the service name that you want to compile the deployment"
  echo "Services availables:" $(ls templates)
  exit 1
fi

if [ -z "$ENVIRONMENT" ];then
  echo "Please set the environment that you want to compile the deployment"
  echo "Environment availables: (production , development)"  
  exit 2
fi

if [ -d "templates/$SERVICE" ]; then
  echo "Compiling: $SERVICE"
else
  echo "Service does not exist"
  echo "Services availables:" $(ls templates)
  exit 3
fi

VALUES="environments/$SERVICE/$ENVIRONMENT.yaml"

if [ -f "$VALUES" ]; then
  echo "Current environment: $ENVIRONMENT"
else
  echo "Environment file $ENVIRONMENT.yaml for service $SERVICE does not exists"
  echo "Services availables:" $(ls environments/$SERVICE)
  exit 4
fi

echo "Start to compile"

rm -rf $OUTPUT
mkdir -p $OUTPUT


for filename in ${SERVICE_FILES[@]}
do
  TEMPLATE="templates/$SERVICE/$filename.yaml"
  COMPILED_FILE="$OUTPUT/$filename.yaml"
  echo "   Find for  $TEMPLATE"
  if [ -f "templates/$SERVICE/$filename.yaml" ]; then
    j2 --format=yaml  "$TEMPLATE" "$VALUES" > "$COMPILED_FILE"
    echo "      created at: $COMPILED_FILE "
  else
    echo "      not found"
  fi

done




