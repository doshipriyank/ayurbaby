#!/bin/bash

. environment.sh

VAR=$1

usage() {
 echo "Argument Required: (nutritional | funfacts | ayurvedic)"
}

if [ -z "$VAR" ];
then 
   usage
fi

echo ${AYURBABY_CLASSPATH}

java -Dspring.profiles.active=prod -classpath ${AYURBABY_CLASSPATH} com.lognsys.babycare.loader.IngestXLSData $VAR 
