

alias cp2='cp -u -v'

# howto
cp2 /c/server/*how-to*.txt /d/backup-local/http-pub/

# pub

cp2 /c/server/apache-tomcat-7.0.59-windows-x64-pub/conf/* /d/backup-local/http-pub/conf/

cp2 -R /c/server/apache-tomcat-7.0.59-windows-x64-pub/webapps/ROOT /d/backup-local/http-pub/

# fortified /host-manager

cp2 /c/server/apache-tomcat-7.0.59-windows-x64-pub/webapps/host-manager/META-INF/context.xml /d/backup-local/http-pub/host-manager

# fortified /manager


# ritb/

cp2  -R /c/server/apache-tomcat-7.0.59-windows-x64-pub/webapps/ritb /d/backup-local/http-pub/

# rlux/



