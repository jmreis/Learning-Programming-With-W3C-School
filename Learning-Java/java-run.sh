#!/usr/bin/env bash
# Script to compile java code
# Reference: https://www.tecmint.com/create-and-execute-jar-file-in-linux/

CLASSNAME=$1

# Creating MANIFEST.MF
echo "Main-Class: $CLASSNAME"> MANIFEST.MF
# Compile the java code
javac -d . $CLASSNAME.java
# Packaging .jar file
jar cvmf MANIFEST.MF $CLASSNAME.jar $CLASSNAME.class
# Run java code with .jar file
java -jar $CLASSNAME.jar
# Remove .class and .jar files
rm -rf *.class *.jar