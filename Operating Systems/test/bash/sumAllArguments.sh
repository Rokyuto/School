#!/bin/bash

sum=0

for number in "$@"
do
    sum=$((sum + number))
done

echo "Сумата на числата е: $sum"

