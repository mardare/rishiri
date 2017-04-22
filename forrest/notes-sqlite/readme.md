## cli
- **show tables:** _.tables_   
- **show cols:** _.headers ON_   
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
