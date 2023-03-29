#!/bin/bash

echo "forEach Loop:"
for i in 4 3 23 "uktc" -3 3.14 "Viksata"
do
	echo $i
done

echo ""

echo "For Loop 2:"
for i in {0..10}
do
	echo $i
done

echo ""
echo "For Loop 3:"
for i in $(seq 1 10)
do
	echo $i
done

echo ""
echo "For Loop 4:"
for i in $(ls ~)
do
	echo $i
done

echo ""
echo "For Loop 5:"
read -s -p "Enter password: " PASS
echo ""
if [[ $PASS == "1234" ]]
then
	read -p "Enter Count: " COUNT
	for i in $(seq 1 $COUNT)
	do
		echo "[$i] CD is opening"
		eject -T
		sleep 2
		echo "[$i] CD is closing"
		eject -T
		sleep 2
	done
else
	echo "Invalid password"
fi
