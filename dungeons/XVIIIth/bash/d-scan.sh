

## -I, --head          	Show document info only
## -i, --include       	Include protocol headers in the output (H/F)
## --connect-timeout 	SECONDS  Maximum time allowed for connection


sl=( 
	"http://wdbed2100617:9082/dsmbl"
	"http://wdbed2100617:9082/dsmfe"
	"http://wdbed2100844"
 	"http://wdbed2100617:9082/dsmbl/Signing"
   )


for s in ${sl[@]};do

	printf "%s " $s 
	curl -sw '%{http_code}' --connect-timeout 2  $s
	# curl -i $sq

	printf "\n"
done

