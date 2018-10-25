# unavoidable python

A: in python everything is an object  
B: python is strongly and dynamically typed language  
C: python doesn't have a native array structure  
```  
dir (<module>)  
type (<module>)  
id (<variable>)  
```
dictionary keys must be of an immutable type    
immutable types: ints, floats, strings, tuples  
    
### mantra ["zen of python"](https://www.python.org/dev/peps/pep-0020/)   
explicit is better than implicit  
there should be one and only one good way  
  
### queue  
* args and kwargs  
* self keyword  
* with requests.sessions...: construct  
* https://docs.python.org/3/library/sqlite3.html  
  
### Perl (1987) vs Python (1990)/Python 3000 (2008)  
  
Perl is withering, probably  
  
Perl has built-in regex and os opetarations  
Python uses Import re for regex, Import os,sys for os operations  
  
Python is OOP oriented, everything is an object including "primitive" types like integer  
Perl has an occured OOP construct, also threading is problematic  
  
Perl encourages one liners  
Pythons makes one liners almost impossible  
  
Perl allows for type inference by syntax: @foobar, %foobar or $foobar  
  
Python: output is TypeError: can only concatenate str (not "int") to str  
```  
i= "1"  
i= i + 1  
```  
Perl: output is 2   
```
$i="1"; $i++; print $i
```
  
Neither Perl nor Python uses null reference  
Python uses no-value/empty signal object: var= None  
Perl marks the variable: undef $var; OR $var = undef  
  
### path
https://learnxinyminutes.com/docs/python3/  
https://developers.google.com/edu/python/
https://automatetheboringstuff.com/
https://github.com/jerry-git/learn-python3#idiomatic-python  
https://docs.python.org/3/tutorial/

https://docs.python.org/2/tutorial/datastructures.html
https://docs.python.org/2/library/datetime.html#datetime-objects

https://github.com/boxeehacks/boxeehack/tree/master/hack/boxee/skin/boxee/720p/scripts   
http://code.activestate.com/recipes/langs/python/  
https://jeffknupp.com/blog/2012/11/13/is-python-callbyvalue-or-callbyreference-neither/  
https://developers.google.com/edu/python/regular-expressions  
http://python.net/~goodger/projects/pycon/2007/idiomatic/handout.html#naming  

https://github.com/learnbyexample/scripting_course/blob/master/Python_curated_resources.md  

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
