# K8S deployment

This file contains all the instructions to deploy VPL ++ to Kubernetes

## Requeriments:

1. Kubernetes and tools: kubectl and so on.
2. Python and the next dependencies:  "j2cli[yaml]"

# Installation

Run 

`./install.sh`

It will create the necesary files and deploy it to the cluster. Also, it will create the required namespaces.

## Compile files on demand

If you need get the configMap, deployment, pvc, pv and service yaml kubernetes files for a service. You can use the script `./compile.sh` to create the deployment files on demand.

### Usage

`./compile.sh service_name environment_name.yaml`

Where service_name accepts: mysql mongo jail api client and moodle. And the environment_name is related to the `./environments/service_name/environment_name.yaml` environment yaml.



