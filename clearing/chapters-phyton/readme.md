

### unavoidable python
https://developers.google.com/edu/python/

https://github.com/boxeehacks/boxeehack/tree/master/hack/boxee/skin/boxee/720p/scripts  
http://code.activestate.com/recipes/langs/python/
https://developers.google.com/edu/python/  
https://jeffknupp.com/blog/2012/11/13/is-python-callbyvalue-or-callbyreference-neither/
https://docs.python.org/3/tutorial/datastructures.html  
https://developers.google.com/edu/python/regular-expressions
http://python.net/~goodger/projects/pycon/2007/idiomatic/handout.html#naming
https://docs.python.org/2/library/datetime.html#datetime-objects

### help
help(filter)

### 18th print-fridge-cal

https://github.com/mstamy2/PyPDF2/blob/master/Sample_Code/basic_features.py  
https://pypi.python.org/pypi/pdfkit/0.4.1  

~~~

import os

def print_line (length= 50):
    print('='*length)

'''1'''

print ("exec sytem command")
os.system("set")
print_line()

'''2'''

a= [1, 10, 40]

for i in a:
    print(i)
    if i == 10: print ("found a 10")
print_line()

'''3'''

print ("%s print with %d values, last one is %d"%('tuples', 3, 0))
print_line()

'''4'''

class sosa:
    def __init__(self):
        pass

print (sosa())
print_line()

'''5'''

from datetime import datetime, timedelta
from time import strptime, strftime

start_date= datetime.strptime('1.1.2018', '%d.%m.%Y')
print(start_date.strftime('W%V %A %d, %B %Y'))

incremented_date= start_date+ timedelta(days=7)
print (incremented_date.strftime('W%V %A %d, %B %Y'))

today= datetime.now()
print(today.strftime('Today W%V %A %d, %B %Y'))
print("Today weekday: %d\nToday month: %s"% (today.day, today.month))

'''6'''

cal_weeks= {
    1: {'start': 101010,'end': 10101010, 'month': 1},
    2: {'start': 119191,'end': 299292, 'month': 1}
}

print(cal_weeks)
print(cal_weeks[1])
print(cal_weeks[1]["start"])

'''7'''
a= [1,2,3,4,5,6]
print(a)
print( list(filter(lambda x: x%2 == 0, a )))

~~~

### virtualenvwrapper (extensio of virtualenv virtualenv.org  = Virtual Python Environment builder)

	https://www.dabapps.com/blog/introduction-to-pip-and-virtualenv-python/

install with ~~~source /usr/local/bin/virtualenvwrapper.sh~~~ 

~~~
	pip install virtualenvwrapper
	sudo pip install virtualenv
	...
	export WORKON_HOME=~/Envs
	mkdir -p $WORKON_HOME
	source /usr/local/bin/virtualenvwrapper.sh

~~~
creat 
	mkvirtualenv env1
	
	pip install django
	lssitepackages

change to env
	workon envX
	
list envs
	ls $WORKON_HOME
