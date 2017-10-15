
# bash

find ./ -name "*.jar" -exec readlink -f {} \; -exec jar tf {} \;|grep -E "jar|rhino"

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

* made in http://dillinger.io/



