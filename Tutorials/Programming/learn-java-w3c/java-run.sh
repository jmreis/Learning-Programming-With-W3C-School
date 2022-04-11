#!/usr/bin/env bash
# Script to compile java code
# Reference: https://www.tecmint.com/create-and-execute-jar-file-in-linux/

CLASSNAME=$1

echo "Main-Class: $CLASSNAME"> MANIFEST.MF
javac -d . $CLASSNAME.java
jar cvmf MANIFEST.MF $CLASSNAME.jar $CLASSNAME.class
java -jar $CLASSNAME.jar
