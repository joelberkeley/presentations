#!/usr/bin/env bash

sudo docker build -t presentation_builder .
sudo docker run -d --rm -v $(pwd)/$1:/opt/presentation presentation_builder
