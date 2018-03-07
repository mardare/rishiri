

### config

ufw= netfilter firewall
iptables= packet filtering and NAT

###   core-software

sudo add-apt-repository ppa:webupd8team/java
sudo apt-get update
sudo apt-get install oracle-java7-installer
which java: /usr/bin/java -> /etc/alternatives/java

sudo apt-get install kate
sudo apt-get install ncdu

sudo apt-get update
sudo apt-get upgrade
sudo apt autoremove

### wine

sudo dpkg --add-architecture i386

wget -nc https://dl.winehq.org/wine-builds/Release.key
sudo apt-key add Release.key
sudo apt-add-repository https://dl.winehq.org/wine-builds/ubuntu/

sudo apt-get update && sudo apt-get upgrade
sudo apt-get install --install-recommends winehq-stable

### xfce

sudo apt-get install xfce4
sudo apt-get install xfce4-goodie
    
sudo apt-get install libcups2
 
### lxde
??sudo apt-get install xinit lxde virtualbox-guest-dkms
    
