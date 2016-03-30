#!/bin/bash

cd wargenerator
mvn clean
cd ..

cd webservice
mvn clean
cd ..

cd j2e
mvn clean
cd ..

cd interceptors
mvn clean
cd ..

cd utils
mvn clean
cd ..

cd exceptions
mvn clean
cd ..

cd entities
mvn clean
cd ..
