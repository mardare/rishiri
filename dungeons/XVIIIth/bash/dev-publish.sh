
echo
printf "\e[1;41m mind your OK \e[0m\n"
printf "start moving (dev) to (pub)..."
printf "\n\n"

dev_source="/c/server/apache-tomcat-7.0.59-windows-x64-dev/webapps/ritb"
pub_dest="/c/server/apache-tomcat-7.0.59-windows-x64-pub/webapps/ritb"



function replicateFolder () {

section=$1			# ex "documents" for /documents folder
section_fmask=$2		# ex "*.*"
subfolder=$3

printf "\e[1;45m\n/$section\e[0m\n"

# copy-plan source => dest

cp -i -R -u -v $dev_source/$section $pub_dest/$subfolder

# copy-plan X dest (code template)


if [[ "$(ls -A $pub_dest/$section/)" ]]; then #folder is empty?

		for f in $pub_dest/$section/$section_fmask
		do
		fname=`basename "${f}"`

		if [ ! -f "$dev_source/$section/$fname" ]; then
			echo "!<$fname> (deprecated) does not exits in $dev_source/$section/"
			rm -i -v "${f}"
        fi
     	done
	else
		echo ".<$pub_dest/$section> (empty) => skipped"
fi

}






##
## section web.xml

printf "\e[1;45mweb.xml\e[0m\n"

fname="web.xml"
if [ -f $dev_source/WEB-INF/$fname ]; then 

	if [[ $(diff -s -q "$dev_source/WEB-INF/$fname" "$pub_dest/WEB-INF/$fname") != *identical* ]]; then
		echo "!<$fname> (differs)"
		diff -d -y --suppress-common-lines $dev_source/WEB-INF/$fname $pub_dest/WEB-INF/$fname
		echo
		echo "more with: <diff -d $dev_source/WEB-INF/$fname $pub_dest/WEB-INF/$fname>"
		echo
		cp -i -v $dev_source/WEB-INF/$fname $pub_dest/WEB-INF/$fname
	else
		echo ".<$fname> (identical) => skipped"
	fi
else
	 echo ".<$fname> (empty) => skipped"
fi





##
## section *jsp

section="jsp"
printf "\e[1;45m\n$section\e[0m\n"

# copy-plan source => dest

for f in $dev_source/*.jsp
do
	fname=`basename ${f}`

	if [[ $(diff -s -q "$dev_source/$fname" "$pub_dest/$fname") != *identical* ]]; then
		echo "!<$fname> (differs)"
		diff -d -y --suppress-common-lines $dev_source/$fname $pub_dest/$fname
		echo
		echo "more with: <diff -d $dev_source/$fname $pub_dest/$fname>"
		echo 
		cp -i -v $dev_source/$fname $pub_dest/$fname

	else
		echo ".<$fname> (identical) => skipped"
	fi

done

# copy-plan X dest 

for f in $pub_dest/*.jsp 
do
	fname=`basename ${f}`

	if [ ! -f "$dev_source/$fname" ]; then
		 echo "!<$fname> (deprecated) does not exits in $dev_source"
		 rm -i -v "${f}"
	fi

done


replicateFolder "images" "*.*"
replicateFolder "documents" "*.*"
replicateFolder "html" "*.*"
replicateFolder "WEB-INF/classes" "*.class" "WEB-INF"
replicateFolder "WEB-INF/lib" "*.*" "WEB-INF"


