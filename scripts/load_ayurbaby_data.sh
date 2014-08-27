#!/bin/bash

. ${HOME}/git/ayurbaby/scripts/environment.sh


VAR=$1


usage() {
 echo "Argument Required: (nutritional | funfacts | ayurvedic)"
}

if [ -z "$VAR" ];
then 
   usage
fi

java -classpath ${AYURBABY_CLASSPATH} com.lognsys.babycare.loader.IngestXLSData $VAR 
