# fhs

	user apps	/usr/bin/firefox, gedit, chrome
			/opt/google/chrome
			
			fhs-canon
			/opt/;/usr/local/
			
			/usr/local: not part of os/not managed by system packager/
			_build_and_maintained_locally_ (make) by sysadmin
			so that not be overwritten by a system reinstall
			part of $PATH (/usr/local/sbin:/usr/local/bin)

			/opt:not part of os/not managed by system packager/3rd party/already 						    			 build (not-made by sysadmin)
			packages, should user convetion /opt/<app>/bin/;/etc/opt/<app>/<app>.conf;/var/opt/<app>/logs/<app>.access
			not in $PATH
			
			/var:/var/cache:/var/log:/var/spoon/: used for application/process operations
			/proc
			/root
                        /boot
                        /dev

		       /tmp

		       /bin
		       /sbin
		       /opt
		       /usr
		       /etc

		       /home
		       /lib
		       /lost+found
		       /misc
		       /mnt       

# bash

find ./ -name "*.jar" -exec readlink -f {} \; -exec jar tf {} \;|grep -E "jar|rhino"

# developer space

sudo apt-get install -y jq
sudo apt-get install -y curl
	
# bash-install

install on master  
http://ttyplus.com/downloads.html  
https://winscp.net/eng/download.php  
http://www.putty.org/  
  
sudo apt-get update
sudo apt-get upgrade
sudo apt-get dist-upgrade
sudo apt-get install mc

uname -a
lsb_release 0a

su -  
df -h  

new session  
Ctrl+Alt+F1 new terminal  
Ctrl+Alt+F7 GUI(X) terminal  

vi /etc/apt/sources.list  
	:%s/(archieve.ubuntu.com|security.ubuntu.com)/old-releases.ubuntu.com/g  

- teamviewer via dw .deb
- 

# linux-config
 
http://www.brendangregg.com/linuxperf.html

# ubuntu
samba browser: sudo apt-get install konqueror

jre/jdk: 
sudo apt-add-repository ppa:webupd8team/java
sudo apt-get update
sudo apt-get install oracle-java7-installer

teamviewer:
sudo dpkg -i teamviewer_linux.deb/teamviewer_linux_x64.deb
teamvie77wer --daemon start
/opt/teamviewer/tv_bin/TeamViewer
/opt/teamviewer/tv_bin/script/teamviewer &

launcher shortcuts for desktop apps:
/usr/share/applications
~/.local/share/applications

* made in http://dillinger.io/



