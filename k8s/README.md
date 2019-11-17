# K8S deployment

This file contains all the instructions to deploy VPL ++ to Kubernetes

## Requeriments:

1. Kubernetes and tools: kubectl and so on.
2. Python and the next dependencies:  "j2cli[yaml]"

## Installation

Run 

`./install.sh`

It will create the necesary files and deploy it to the cluster. Also, it will create the required namespaces.

## Reset

To reset the cluster, run `./reset.hs` it will try to erase everithing about vpl in kubernetes

## Compile files on demand

If you need get the configMap, deployment, pvc, pv and service yaml kubernetes files for a service. You can use the script `./compile.sh` to create the deployment files on demand.


### Usage

`./compile.sh service_name environment_name.yaml`

Where service_name accepts: mysql mongo jail api client and moodle. And the environment_name is related to the `./environments/service_name/environment_name.yaml` environment yaml.



## Deploy services on demand

`kubectl create -f build/service/env`

## Remove services on demand

`kubectl delete -f build/service/env`

## Force to detach a pv

Sometimes when you delete a pv it could be atached and it is not able to be removed. So, to solve it, you need to detach the volume completly. 

**Warning** if there are pods using those pv you could loss data

`kubectl get pv | tail -n+2 | awk '{print $1}' | xargs -I{} kubectl patch pv {} -p '{"metadata":{"finalizers": null}}'`


## Deploy objects by demand 