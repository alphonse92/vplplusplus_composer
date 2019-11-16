# Environments

This folder contains the environent variables per microservice

## Structure

The environment definition is based by the folder name and the environment.yaml file. Each folder should be named as the microservice that you want to describe. Inside of this folder you should create a yaml file, called by the environment name. 

For example:

the path `api/production.yaml` is related to the environment production for the microservice called api

## ATENTION:

If you want to add a new configuration for a microservice pay atention to the next considerations:

1. Add a file called .example.yaml, that file should be an example of environment variables
2. add the next .gitignore in order to prevent unintended sensible environment varibles such passwords for example

```
# Ignore everything
*
# But not these files...
!.example.yaml
```