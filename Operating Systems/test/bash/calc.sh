#!/bin/bash

option=$1
number1=$2
number2=$3

# Проверка за валидна опция и извършване на съответната операция
case $option in
    -s)  # Сумиране на двата числа
        sum=$((number1 + number2))
        echo "Сумата на $number1 и $number2 е $sum"
        ;;
    -m)  # Намиране на по-малкото число
        if [ "$number1" -lt "$number2" ]; then
            min=$number1
        else
            min=$number2
        fi
        echo "По-малкото число между $number1 и $number2 е $min"
        ;;
    -M)  # Намиране на по-голямото число
        if [ "$number1" -gt "$number2" ]; then
            max=$number1
        else
            max=$number2
        fi
        echo "По-голямото число между $number1 и $number2 е $max"
        ;;
    -a)  # Намиране на средно-аритметичното на двата числа
        average=$(echo "scale=2; ($number1 + $number2) / 2" | bc)
        echo "Средно-аритметичното на $number1 и $number2 е $average"
        ;;
    *)  # Грешка при невалидна опция
        echo "Invalid arguments" >&2
        exit 1
        ;;
esac
