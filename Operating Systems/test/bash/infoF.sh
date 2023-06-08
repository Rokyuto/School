#!/bin/bash

file=$1
option=$2

case $option in
    -n)
        echo $(whoami) > "$file"
        ;;
    -l)
        echo $(pwd) > "$file"
        ;;
    -t)
        echo $(date) > "$file"
        ;;
    -c)
        echo $(cal) > "$file"
        ;;
    *)
        echo "Invalid argument" >&2
        exit 1
        ;;
esac
