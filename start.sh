#!/bin/sh

CLASSPATH=$CLASSPATH:.
for jarfile in `ls target/dependencies/*.jar`
do
  CLASSPATH=$CLASSPATH:$jarfile
done

java -cp $CLASSPATH fitnesseMain.FitNesseMain -p 9595 -d . -e 0
