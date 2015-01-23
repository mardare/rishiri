package hellaStudy2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.Locale;
import java.util.Properties;

import javax.print.attribute.standard.OutputDeviceAssigned;

/*
*  function/   
*   main() =>        |    inst singleton           |   singleton load-from-file-if-exists
*                    |    spoc properties txt file |             add/update
*                    |                 		  	   |             save-to-file 
*    
*   oop/			
*   
*   main class ------+> singleton
*     
*   
*   pattern(s)/ 
*   	
*   singleton      
*   	
*     
*/

public class PropertiesFileStudy {
	
	final static String filename="\\data\\PropertiesFileStudy.properties";
	final static Properties filecontent=new Properties();

	public static void main(String[] args) throws IOException {
		
		//early instantiation
		PropertiesFileStudySingletonEarlyAccessFile spocEarly=PropertiesFileStudySingletonEarlyAccessFile.getInstance();
		
		System.out.format("sgt address is %s%n",spocEarly.toString().split("@")[1]);
		System.out.format("anon1 sgt address is %s%n",PropertiesFileStudySingletonEarlyAccessFile.getInstance().toString().split("@")[1]);
		System.out.format("anon2 sgt address is %s%n",PropertiesFileStudySingletonEarlyAccessFile.getInstance().toString().split("@")[1]);
		
		//lazy instantiation
		PropertiesFileStudySingletonLazyAccessFile spocLazy=PropertiesFileStudySingletonLazyAccessFile.getInstance();
		
		System.out.format("sgt address is %s%n", spocLazy.toString().split("@")[1]);
		System.out.format("anon1 sgt address is %s%n", PropertiesFileStudySingletonLazyAccessFile.getInstance().toString().split("@")[1]);
		System.out.format("anon2 sgt address is %s%n", PropertiesFileStudySingletonLazyAccessFile.getInstance().toString().split("@")[1]);

		//dump system properties to screen and "/data/java-system-properties.txt"
		System.out.println(String.format("%30s","").replace(" ", "-"));
		
		Properties p=System.getProperties();
		p.store(System.out,"system properties");
		
		p.store(new FileOutputStream(new File("data/java-system-properties.txt")), "system properties");
		//ready
		
		System.out.println(spocEarly.add ("a","alabama"));
		System.out.println(spocEarly.add ("c", "clifford"));
		System.out.println(spocEarly.add ("a", "athene"));
		System.out.println(spocEarly.add ("g", "grivita"));
		
		spocEarly.list();
		System.out.format("-- %s --%n", "printing properties");
		spocEarly.print();
		
		//for "localized resources"/i18, java.util.ResourceBunde is the right tool as it selects the file based on current language/regional
		
		java.util.ResourceBundle r= java.util.ResourceBundle.getBundle("data/java-system-propertiess.txt");
		System.out.println(r.getKeys());
	}
	
}

//encapsulate instance-monopoly
class PropertiesFileStudySingletonEarlyAccessFile 
					extends PropertiesFileStudyFunctional {
	
	private final static PropertiesFileStudySingletonEarlyAccessFile thiz=new PropertiesFileStudySingletonEarlyAccessFile();
	
	private PropertiesFileStudySingletonEarlyAccessFile(){};
	
	public static PropertiesFileStudySingletonEarlyAccessFile getInstance(){
		return thiz;
	}
}

class PropertiesFileStudySingletonLazyAccessFile{
	
	private static PropertiesFileStudySingletonLazyAccessFile thisz;
	
	private PropertiesFileStudySingletonLazyAccessFile(){};
	
	public static PropertiesFileStudySingletonLazyAccessFile getInstance(){
		
		if (thisz==null) 
				synchronized (PropertiesFileStudySingletonLazyAccessFile.class)
						{thisz=new PropertiesFileStudySingletonLazyAccessFile();};
		
		return thisz;
	}
}

// encapsulate instance-functionality outside singleton mechanism
class PropertiesFileStudyFunctional{
	
	private static Properties _p=new Properties();
	
	protected PropertiesFileStudyFunctional(){
		System.out.println("sgt-functional instance created, address is "+this.toString().split("@")[1]);
	}

	/**
    * @return     true if inserted
    *             false if not inserted, key already in hash
    */
	public Boolean add (String key, String value){
		return (_p.put(key, value)==null)?true:false;
	}
	
	public String get (String key){
		return _p.getProperty(key);
	}

	public void list(){
		_p.list(System.out);
	}
	
	public void print(){
		
		Enumeration e = _p.propertyNames();
		
		while (e.hasMoreElements()){
			String k= (String) e.nextElement();
			System.out.format("\t%s=%s%n",k, _p.get(k));		}
		
	}
}