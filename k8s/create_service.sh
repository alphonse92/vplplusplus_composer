#!/bin/bash

SERVICE=$1
ENVIRONMENT=$2

./compile.sh "$SERVICE" "$ENVIRONMENT"

# The start order is very important
./create_object.sh "$SERVICE" "$ENVIRONMENT" "pv"
./create_object.sh "$SERVICE" "$ENVIRONMENT" "pvc"
./create_object.sh "$SERVICE" "$ENVIRONMENT" "configMap"
./create_object.sh "$SERVICE" "$ENVIRONMENT" "service"
./create_object.sh "$SERVICE" "$ENVIRONMENT" "deployment"