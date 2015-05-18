

sheet=`basename $0`

m0="\e[0m"		# reset
m1="\e[1;45m"		# pink bg
m2="\e[1;42m"		# green bg
m3="$m2\e[1;32m"	# light-green
m3=""


printf "\n\t\t\t"
printf "$m1$sheet$m0\n\n"

printf "$m2 ^T $m0 $m3 transpose $m0                                  $m2 ^sh-L $m0 $m3 multiple select and paste by column $m0\n"
printf "                                                                                                                       \n"
printf "                                                                                                                       \n"
printf "                                                                                                                       \n"
printf "$m2 ^F3 $m0 $m3 find prev $m0 $m2 F3 $m0 $m3 find next $m0                                                             \n"
printf "$m2 ^P $m0 $m3 $m0 find												       \n"
printf "$m2 ^G(:) $m0 $m3 goto line $m3 $m2 ^R(@) $m0 $m3 goto symbol $m0 $m2 F12 $m0 $m3 goto definition $m0 $m2 sh^F+Enter $m0 $m3 usage $m0 \n"
printf "                                                                                                                       \n"
printf "                                                                                                                       \n"
printf "$m2 ^W $m0 $m3 close tabs											       \n"






