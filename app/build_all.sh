#!/bin/bash

## Building client
cd client
mvn clean package
cd ..

## Building the modules of the j2e system
cd entities
mvn clean package
cd ..

cd exceptions
mvn clean package
cd ..

cd utils
mvn clean package
cd ..

cd interceptors
mvn clean package
cd ..

cd j2e
mvn clean package
cd ..

cd webservice
mvn clean package
cd ..

cd wargenerator
mvn clean package
cd ..

## Building the .Net system
cd dotNet
./compile.sh
cd ..
