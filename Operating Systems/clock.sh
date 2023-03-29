#!/bin/bash

function alarm(){
	for i in {1..10}
		do
			clear
			sleep 0.5
			echo "Wake up!" | figlet
			sleep 0.5
		done
}

EYE="@@"
while true
do
	clear
	echo -e "\033[0;31mMy Clock: "
	echo -n "Today's date: "
	date +%F
	
	if [[ $EYE == "@@" ]]
	then 
		EYE="@-"
	else
		
		EYE="@@"
	fi
	echo "Alarm for $*"
	date +%T | cowsay -e $EYE
	echo "Press Ctrl + C to exit"
	sleep 1
	for hour in $@
	do
		if [[ $(date +%T) == $hour ]]
		then
			alarm
		fi
	done
done
