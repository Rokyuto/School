#!/bin/bash

while read -r line
do
    name = $(echo $line | awk '{print $1}')
    grade = $(echo $line | awk '{print $2}')
    if((grade > max_grade))
    then
    	max_grade = $grade
    	max_name = $name
    fi
done < grades.info

echo $max_name
