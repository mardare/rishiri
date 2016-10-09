package Study;
// version final
// publish-to https://github.com/mardare/rishiri/tree/master/dungeons/java/src/study
// dependency resources/propertyFileStudy.properties

/*
	Properties __> Hashtable <Object, Object>
 	
 		no null keys
 		no null values
 		unique elements => recurring key in a file will have the last value in the object representation
 
*/

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileStudy {

	final static Properties properties = new Properties();	

	void loadPropertiesFromFile (final String filename) throws IOException{
		
		java.io.InputStream fileReader = new PropertyFileStudy().getClass().getClassLoader().getResourceAsStream(filename);
		properties.load(fileReader);	
		
	}
	
	public static void main(String[] args) throws IOException {
	
		//file.prop must be in BuildPath Project > Properties > Java Build Path > Source > Add Folder		
		new PropertyFileStudy().loadPropertiesFromFile("propertyFileStudy.properties");
		
		System.out.format("Properties object\n type %s ;\n content %s",
					properties.getClass().getGenericSuperclass(), properties.toString());
	
		System.out.println();
		for ( Object key: properties.keySet()){
			System.out.format(" key %s= %s\n", key, properties.getProperty(key.toString()));	
		}
	}	
}
