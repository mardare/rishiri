

## how-to

- dw report to /rishiri/tmp
- a4 draft per sym with transcripted items
- use **fin-sql-gen.xls** to insert 

- check inserted
   _.mode line_
    _select * from fundamentals where sym=<sym>;_

   _.mode list_
	_select * from fundamentals where sym=<sym> and year='2016' and period='Q3';_
- save snapshot 
   _.dump fundamentals_ in npp
- when done -> backup to file
   _.backup  backup/snapshot-YYYY-MM-DD_

https://github.com/mardare/rishiri/tree/master/forrest/notes-sqlite
https://github.com/adam-p/markdown-here/wiki/Markdown-Cheatsheet