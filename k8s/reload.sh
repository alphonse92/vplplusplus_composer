#!/bin/bash
SERVICE=$1
ENV=$2

./delete_object.sh $SERVICE $ENV configmap 
./delete_object.sh $SERVICE $ENV deployment

./compile.sh $SERVICE $ENV

./create_object.sh $SERVICE $ENV configmap 
./create_object.sh $SERVICE $ENV deployment