#!/bin/bash

# Проверка за наличие на три аргумента
if [ $# -ne 3 ]
then
    echo "Грешка: Трябва да подадете точно три аргумента." >&2
    exit 1
fi

# Проверка дали първият аргумент е цяло положително число
if ! [[ $1 =~ ^[1-9][0-9]*$ ]]
then
    echo "Грешка: Първият аргумент трябва да бъде цяло положително число." >&2
    exit 1
fi

repetitions=$1
text=$2
filename=$3

# Повтаряне на текста и запис във файла
for (( i=1; i<=$1; i++ ))
do
    echo $2 >> $3
done

echo "Файлът $filename е създаден и записан успешно."

