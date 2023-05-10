#!/bin/bash

min=$1

# Итериране през всички подадени аргументи
for number in $@
do
    # Проверка дали текущото число е по-малко от най-малкото
    if [ $number -lt $min ]
    then
        min=$number
    fi
done

echo "Най-малкото число е: $min"
