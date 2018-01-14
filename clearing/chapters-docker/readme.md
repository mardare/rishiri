

### docker

	config
		/etc/init.d/docker
		/etc/default/docker

		/etc/systemd/system/docker.service
		/lib/systemd/system/docker.service
		
		/etc/docker

	images, volumes,...		
	/var/lib/docker

###docker network 
	https://docs.docker.com/engine/userguide/networking/default_network/custom-docker0/
	https://docs.docker.com/engine/userguide/networking/default_network/container-communication/#communication-between-containers


	view docker bridge/allow comm
	ip addr show (or ifconfig)
	sudo brctl show
	sudo iptables -L -n

###list volumes of instance
	d ps
	docker inspect -f '{{ .Mounts }}' <instance>

	run with volume
	docker run -it -v /tmp:/tmp <image> /bin/bash	

###see <image> commits
	docker history open.docker.ing.net/cbportal-develop:latest
	docker history --no-trunc=true open.docker.ing.net/cbportal-develop:latest

###config
	daemon
	/etc/docker/daemon.json
	/etc/docker/key.json

###install
	sudo apt install bridge-utils (for brctl)

###bash-in as root
docker exec -u 0 -it db-manager bash


