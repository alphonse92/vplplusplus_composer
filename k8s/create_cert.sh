#!/bin/bash

rm -rf certs
mkdir -p certs

openssl genrsa -out ./certs/cert.key 2048
openssl req -new -key ./certs/cert.key -out ./certs/cert.csr
openssl x509 -req -days 365 -in ./certs/cert.csr -signkey ./certs/cert.key -out ./certs/cert.crt

kubectl delete secret certificates
kubectl create secret generic certificates --from-file ./certs/cert.crt --from-file ./certs/cert.key