

# convert from windows to posix like path

echo "/$1" | sed 's/\\/\//g' | sed 's/://' | sed 's/ /\ /'

#tood 	create command for change dir
#usage 	cd | ~/cd2.sh 'C:\RADWorkspace\workspaces\px85\EB\webApplication\WEB-INF\XML\bttSrc\flows\'
