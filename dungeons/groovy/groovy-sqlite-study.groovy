
/*${user.home}/.groovy/grapes/org.xerial/sqlite-jdbc/jars
* alt sqlite-jdbc-3.15.1.jar@https://bitbucket.org/xerial/sqlite-jdbc/downloads
*/
@Grapes([
 @Grab(group='org.xerial',module='sqlite-jdbc',version='3.15.1'),
 @GrabConfig(systemClassLoader=true)
])

import java.sql.*;
import groovy.sql.Sql;

import org.sqlite.SQLite;

def sql = Sql.newInstance("jdbc:sqlite:c:\\temp\\rishiri\\dungeons\\groovy\\groovy-sqlite-study.db", "org.sqlite.JDBC")

sql.eachRow("select * from hella") {  
 println("item=${it.item}, prince= ${it.price}") 
}


