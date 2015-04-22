
# command overwrite
alias cp2='cp -u -v'

# bash script per hostname

host=`hostname`

host_vm207="BUHDEVLU01"
host_wkstation188="WPROD0071188"

echo current host is ${host}

if [ "$host" == "$host_vm207" ]; then
	echo selecting script for $host_vm207 
	cp2 ~/.bashrc /d/backup-local/bash/.bashrc_207
	cp2 ~/*.sh /d/backup-local/bash
fi

if [ "$host" == "$host_wkstation188" ]; then
	echo selecting script for $host_wkstation188
	cp2 ~/.bashrc /c/My\ Data/so20/80\ -\ rishiri\ hyades\ clouds/rishiri/dungeons/XVIIIth/bash/.bashrc_188
	cp2 ~/*.sh /c/My\ Data/so20/80\ -\ rishiri\ hyades\ clouds/rishiri/dungeons/XVIIIth/bash/
fi

echo done
