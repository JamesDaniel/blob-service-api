#!/bin/bash
docker build -t jmcgarr/blobapi:latest .
docker run -p 8081:8081 jmcgarr/blobapi
