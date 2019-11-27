#!/bin/bash

ENV=$1

if [ -z "$ENV" ];then
  echo "Please set the environment name"
  exit 1
fi

PATH_TO_CERT_FOLDER="./certs/$ENV"
rm -rf "$PATH_TO_CERT_FOLDER"
mkdir -p "$PATH_TO_CERT_FOLDER"



openssl genrsa -out "$PATH_TO_CERT_FOLDER/cert.key" 2048
openssl req -new -key "$PATH_TO_CERT_FOLDER/cert.key" -out "$PATH_TO_CERT_FOLDER/cert.csr"
openssl x509 -req -days 365 -in  "$PATH_TO_CERT_FOLDER/cert.csr" -signkey  "$PATH_TO_CERT_FOLDER/cert.key" -out  "$PATH_TO_CERT_FOLDER/cert.crt"

kubectl delete secret "gateway-$ENV-certificates" --namespace="$ENV"
kubectl create secret generic "gateway-$ENV-certificates"  --namespace="$ENV" --from-file "$PATH_TO_CERT_FOLDER/cert.crt" --from-file  "$PATH_TO_CERT_FOLDER/cert.key"