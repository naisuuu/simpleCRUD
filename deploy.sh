#!/usr/bin/env bash

 # Pull latest docker image of repo
 docker pull $DOCKERHUB_USERNAME/simplecrud:latest

 # Stop any running instances
 docker stop simplecrud

 # Run docker container
 docker run -d -p 8080:8080 --name simplecrud $DOCKERHUB_USERNAME/simplecrud:latest