#!/bin/bash

# This is comment
read -p "Do you want to open CD: " option

if [[ $option == "Yes" ]]
then
	read -s -p "Enter password: " password
	echo
	if [[ $password == "1234" ]]
	then
		echo "CD is opening ..."
		eject -T
		sleep 3
		echo "CD is closing ..."
		eject -T
	else
		echo "Invalid password"
	fi
else
	echo "No command"
fi

echo "Bye bye"
