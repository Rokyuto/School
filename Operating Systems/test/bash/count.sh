#!/bin/bash

for arg in "$@"; do
    # Проверка дали пътят е валиден
    if [ -e "$arg" ]
    then
        count=$(find $arg -mindepth 1 -maxdepth 1 | wc -l)
        echo "Брой файлове и директории в '$arg': $count"
    fi
done
