#!/bin/bash

SERVICE=$1
ENVIRONMENT=$2

./compile.sh "$SERVICE" "$ENVIRONMENT"

echo ""

# The start order is very important
./delete_object.sh "$SERVICE" "$ENVIRONMENT" "service"
./delete_object.sh "$SERVICE" "$ENVIRONMENT" "configMap"
./delete_object.sh "$SERVICE" "$ENVIRONMENT" "deployment"
./delete_object.sh "$SERVICE" "$ENVIRONMENT" "pvc"
./delete_object.sh "$SERVICE" "$ENVIRONMENT" "pv"
