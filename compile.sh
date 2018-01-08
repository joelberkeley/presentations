#!/usr/bin/env bash

docker build -t presentation_builder .
docker run -d --rm -v $(pwd)/$1:/opt/presentation presentation_builder
