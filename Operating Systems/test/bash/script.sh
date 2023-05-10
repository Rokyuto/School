#!/bin/bash

file="$1"
shift # Removes the first argument

sum=0
count=0

for number in "$@"
do
    sum=$(($sum + $number))
    count=$((count + 1))
done

average=$(echo "scale=2; $sum / $count" | bc)

echo "$average" > "$file"
