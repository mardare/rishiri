## HOW-TO COLOR/

#printf "<CODE> fhqwhgads"
#printf "\e[1;35m fhqwhgads"

#<CODE>
#	red
#	\e[1;31m
#
#	green
#	\e[32m
#	light-green
#	\e[1;32m
#
#	royal-blue
#	\e[1;34m
#
#	light-blue
#	\e[1;36m
#
#	white
#	\e[1;37m
#
#	grey
#	\e[1;30m
#
#	red background
#	\e[1;41m
#
#	green background
#	\e[1;42m	
#
#	blue background
#	\e[1;44m
#
#	pink background
#	\e[1;45m
#
#	white background
#	\e[1;47m
#
#	clear color
#	\e[0m
#</CODE>


## HEADER/

printf "\n\n"
printf "\t\e[1;35m"; date "+W%V/D%j";	 printf "\e[1;30m\t"; date "+%a %e.%m.%y"; printf "\n";
printf "\e[0m=%.0s" {1..65} 
printf "\n"


#cal3m=`perl -e '($sec,$min,$hour,$mday,$mon,$year,$wday,$yday,$isdst) = localtime; $cal3m=qx{cal -3m}; $cal3m=~s/\s$mday\s/ \\e\[1;45m$mday\\e\[0m\ /g; print $cal3m'`

cal3m=`perl -e '($sec,$min,$hour,$mday,$mon,$year,$wday,$yday,$isdst) = localtime; $cal3m=qx{cal -3m};$mdc=qq{\\e\[1;45m$mday\\e\[0m};$cal3m=~s/$mday(.*?)(.....................\r)/$mdc$1$2/; print $cal3m'`

echo "$cal3m"


printf "\n\n\e[1;30m"

## QUOTE/

dq=(
	"baffle, baffled -- bewilder, perplex [French bafouer/beffer]"
	"modular group --  mathematics projective special linear group, acts on the upper-half of the complex plane, 
	                   and the name |modular group| comes from the relation to moduli spaces and not from modular arithmetic"
	"monad --  single unit, the number one, indivisible and hence ultimately simple entity, such as an atom or a person; a single-celled organism"
	"beget -- give rise to, bring about; synonyms spawn, create, bring into being, cause
		   |killings beget more killings|"
        "The world breaks everyone and afterward many are strong at the broken places -- Ernest Hemingway"
	"phylum --  principal taxonomic category that ranks above class and below kingdom [Greek phulon: race]"
	"hebdo, hebdomadaire -- relatif a la semaine, journal paraissant toutes les semaines [Greek hebdomas]"
	"All is flux, nothing stays still/You could not step twice into the same river -- Heraclitus 535-475 BC"
	"arta, acces la spatiul sacru -- am"
	"[...] it felt like I was standing still, while everything else was in such flux -- beck, 2014"
	"cioran -- tigan, hot, borfas; cioranie: hotie"
	"the tower (xvi) -- 16th trump or Major Arcana, |La Foudre| fulgerul....;follows immediately after The Devil; meaning danger, crisis, destruction, 
			    and liberation;|Either the querents must make changes in their own lives, or the changes will be made for them|"
	"persnickety -- placing too much emphasis on trivial or minor details; fussy; requiring a particularly precise or careful approach; fastidious |a persnickety teacher|"
	"The hardest thing to predict is the future -- Yogi Berra (baseball catcher, New York Yankees)"
	"haffi -- Jamaican Patois |have to|"
	"pum pum -- Jamaican Patois |pussy|"
	"bombaclat -- Jamaican Patois |fuck!|"
	"buyaka -- Jamaican sound of a gunshot"
	"asinine -- adj. like an ass, esp. stupid or stubborn.  asininity n. [Latin asinus: ass]"
	"If you're doing it for the money, you'll always be underpaid -- Scott Bell"
	"buckslip -- slip of paper, size of a U.S. dollar bill (a buck), which includes additional information about a product; 
	             serve as a last-minute addition if new or different information must be provided"
        "balderdash --  n. nonsense. [origin unknown]"
	"tempus edax rerum: time, gluttonous of things/time, devourer of all things (edax: eat; rerum: things)"
	"staruitor -- adv. 1. adj. insistent, perseverent, statornic, tenace, persuasiv, sarguincios, zelos, insistent;"
	"freight  -- goods transported in bulk by truck, train, ship, or aircraft; synonyms cargo, load, haul, consignment"
	"god is static, we are flux -- am"
	"Not deer! Beer! It's a typo! Use your head, for Christ's sake! --  Delirious, 1991"
	"indentured servitude -- labor system whereby young people paid for their passage to the New World (e.g. American colonies) 
	                         by working for an employer for a certain number of years; 
				 They would work for a fixed number of years, then be free to work on their own"
        "There are no atheists in foxholes --  origin uncertain, though military is certain"
	"sheath -- cover for the blade of a knife or sword,  living tissue that closely envelops another"
	"haberdasher -- a dealer in goods for dressmaking and sewing"
	"epiphenomenon -- a secondary symptom, occurring simultaneously; mental state regarded as a byproduct of brain activity"
	"low-hanging fruit -- ?"
	"Man needs a dream to bear reality -- Sigmund Freud"
	"We live in the same world, still we move at different speeds, see things different and we end up chasing different dreams -- ?"
	"age of aquarius -- in pop culture refers to the advent of the New Age movement in the 1960s and 1970; 
	                    astrological term denoting either the current or forthcoming astrological age, depending on the method of calculation; 
			    there are twelve astrological ages corresponding to the twelve zodiacal signs in western astrology"
	"resveratrol --  natural phenol, produced naturally by several plants in response to injury or when the plant is under attack by pathogens 
	                 such as bacteria or fungi"
	"discombobulated -- disconcert or confuse"
	"thrift -- using money not wastefully; synonyms: frugality, scrimping; antonyms: extravagance"
	"shambolic -- disorderly or chaotic (British slang); |it's a shambolic system|"
	"furtive -- avoid notice or attention;guilty nervousness;synonyms: secretive, covert, cloak-and-dagger, sneaky;|they spent a furtive day together|"
        "ponderous -- dull, slow and clumsy because of great weight;synonyms: clumsy, heavy, awkward, lumbering"
	"stint -- inadequate amount of (something); allotted period of work; limitation of supply or effort; small bird"
	"scolding -- an angry rebuke; synonyms:	reproach, admonish; |a scolding glare|"
	"humdrum -- lacking excitement, dullness"
	"We think of our future selves like we think of others: in the third person -- 	Derek Parfit (British philosopher)"
	"the insula -- controls the switch between daydreaming and attention; an important structure about an inch or so beneath 
	               the surface of the top of your skull"
        "If you want to be more productive and creative, and to have more energy, the science dictates that you should partition your day into project periods"
        "malox -- antacid medication; contains the active ingredient calcium carbonate; treat symptoms associated with heartburn, indigestion, or upset stomach"
	"the devil takes care of its own -- ?"
	"wagwan -- Jamaican Patois |hello|what's going on|"
	"Jiizas: di Buk We Luuk Rait bout Im -- Jamaican Patois translation of the Gospel of Luke"
	"Di Jamiekan Nyuu Testiment -- Jamaican Patois translation of the New Testament"
	"13.4.1870 -- est. The Met (Metropolitan Museum of Art) <TOOD match date with date>"
	"17.4.1880 -- est. National Bank of Romania"
	"serb -- taran dependent de stapanul feudal; sinonim - iobag, rob; etimologie - lat. servus; 6.4.1749 Constantin Mavrocordat a absolvit serbia in Moldova" 
	"...and the spirit returneth unto god who gave it"
	"Perfection in design is achieved not when there is nothing more to add, but rather when there is nothing more to take away -- Antoine de Saint-Exupery"
  	"The next best thing to having good ideas is recognizing good ideas -- Eric S. Raymond"
	"habeas corpus -- 'you have the body' in Latin, technically only a procedural remedy; it is addressed to the custodian, to present proof of authority, allowing the court to determine whether the custodian has lawful authority to detain the prisoner;"
	"Nothing in life is to be feared, it is only to be understood -- Marie Curie"

 


)

##DEBUG
#for i in ${dq[@]};do
#	echo $i
#done

r=$(( $RANDOM % ${#dq[@]} ))
r=$(( $RANDOM % ${#dq[@]} ))
r=$(( $RANDOM % ${#dq[@]} ))
echo ${dq[r]}

printf "\n"
r=$(( $RANDOM % ${#dq[@]} ))
r=$(( $RANDOM % ${#dq[@]} ))
r=$(( $RANDOM % ${#dq[@]} ))
echo ${dq[r]}

### $(whoami) slayer17\primo
### $0 current script
### $SHELL /bin/sh
