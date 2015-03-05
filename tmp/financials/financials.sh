
perl -n -e 'if (/^\d{2}/) { @val=split/;/}; if (/^PER/){@item=split/;/} END{print @item,@val}' financials-db.txt
