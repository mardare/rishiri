## cli
- **show tables:**  _.tables_   
- **show cols:**  _.headers ON_   
- **list col names horizontally:**  _.mode line_  (default _.mode list_)
- **set column separator:** 
_sqlite3 -separator " # " zxc.db "select * from tableX where date>=datetime('now', '-7 days');"_

## datetime

- **add/sub**
~~~
SELECT datetime('now');
SELECT datetime('now', '+15 minutes');
SELECT datetime('now', '+12 hours');
SELECT datetime('now', '+5 days');
SELECT datetime('now', '+1 month');
~~~

- **"dd.mm.yyyy" => yyyy-mm-dd**
~~~
select 
 datetime(substr(date, 7, 4) || '-' || substr(date, 4, 2) || '-' || substr(date, 1, 2)) date
~~~
- **yyyy-mm-dd => "dd/mm"**
~~~
select strftime('%d/%m', date) from zxc;
~~~
~~~
select strftime('%d-%m-%Y %H:%M:%S', datetime('now'));
~~~

## table/database to sql

- **generate only insert statements for table data**
~~~
.mode insert
select * from abc;
~~~
- **generate all sql statements for table re-creation**
~~~
.dump abc
~~~

## backup database

~~~
.backup  backup/snapshot-YYYY-MM-DD
~~~
