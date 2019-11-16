#!/bin/bash

SERVICE=$1
ENVIRONMENT=$2
OUTPUT="./build/$SERVICE/$ENVIRONMENT"
SERVICE_FILES=(configMap deployment pv pvc service)
PATH_SERVICE_TEMPLATES="services"
PATH_ENVIRONMENT_VARIABLES="environments"

if [ -z "$SERVICE" ];then
  echo "Please set the service name that you want to compile the deployment"
  echo "Services availables:" $(ls $PATH_SERVICE_TEMPLATES/)
  exit 1
fi

if [ -z "$ENVIRONMENT" ];then
  echo "Please set the environment that you want to compile the deployment"
  echo "Environment availables: (production , development)"  
  exit 2
fi

if [ -d "$PATH_SERVICE_TEMPLATES/$SERVICE" ]; then
  echo "Compiling: $SERVICE"
else
  echo "Service does not exist"
  echo "Services availables:" $(ls $PATH_SERVICE_TEMPLATES/)
  exit 3
fi

VALUES="$PATH_ENVIRONMENT_VARIABLES/$SERVICE/$ENVIRONMENT.yaml"

if [ -f "$VALUES" ]; then
  echo "Current environment: $ENVIRONMENT"
else
  echo "Environment file $ENVIRONMENT.yaml for service $SERVICE does not exists"
  echo "Services availables:" $(ls namespaces)
  exit 4
fi

echo "Start to compile"

rm -rf $OUTPUT
mkdir -p $OUTPUT


for filename in ${SERVICE_FILES[@]}
do
  TEMPLATE="$PATH_SERVICE_TEMPLATES/$SERVICE/$filename.yaml"
  COMPILED_FILE="$OUTPUT/$filename.yaml"
  echo "   Find for  $TEMPLATE"
  if [ -f "$PATH_SERVICE_TEMPLATES/$SERVICE/$filename.yaml" ]; then
    j2 --format=yaml  "$TEMPLATE" "$VALUES" > "$COMPILED_FILE"
    echo "      created at: $COMPILED_FILE "
  else
    echo "      not found"
  fi

done




