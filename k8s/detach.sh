#!/bin/bash

SERVICE=$1
ENVIRONMENT=$2

COMPILE=$3

if [ -z "$COMPILE" ];
then
  ./compile.sh "$SERVICE" "$ENVIRONMENT"
fi

./delete_object.sh "$SERVICE" "$ENVIRONMENT" "pvc"
./delete_object.sh "$SERVICE" "$ENVIRONMENT" "pv"