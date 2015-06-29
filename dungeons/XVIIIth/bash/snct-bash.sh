
# command new 
alias cp2='cp -u -v'

# bash script per hostname

host=`hostname`

host_vm207="BUHDEVLU01"
host_wkstation188="WPROD0071188"
host_wkstation603="WDBED2100603"

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

if [ "$host" == "$host_wkstation603" ]; then
	echo selecting script for $host_wkstation603

	cp2 ~/.bashrc /c/users/d-va57qy/57/backup-local/bash/.bashrc_603
	cp2 ~/*.sh /c/users/d-va57qy/57/backup-local/bash/
fi

echo done
