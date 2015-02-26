package hellaStudy2;


public class StringStudy {

	public static String s6=new String("123");
	
	@SuppressWarnings("restriction")
	public static void main(String[] args) throws Exception {


		//object implemented using char[]
		String s8="abcdef";
		
		//back to impl. type via System.arraycopy(...) 
		System.out.println(s8.toCharArray());
		
		//...are IMMUTABLE (and FINAL)
		System.out.format("string %s; address %d%n", s6, memHelper().staticFieldOffset(StringStudy.class.getField("s6")));
		s6+="...789";
		System.out.format("string %s; address %d%n", s6, memHelper().staticFieldOffset(StringStudy.class.getField("s6")));
		
	}
	
	 /* 
	 * "sun.misc.Unsafe"
	 * 
	 * fix 64bit, jre7 
	 * eclipse windows/preferences/java/compiler/errors/warnings/deprecated and restricted API/forbidden reference = Warning 
	 * 
	 * source code 
	 * http://grepcode.com/file/repository.grepcode.com/java/root/jdk/openjdk/6-b14/sun/misc/Unsafe.java
	 *
	 *
	 */
	
	  private static sun.misc.Unsafe memHelper() throws Exception {

		  // get hold of <private static final Unsafe theUnsafe = new Unsafe();>
		  java.lang.reflect.Field field = sun.misc.Unsafe.class.getDeclaredField("theUnsafe");  
		  
		  field.setAccessible(true);
		  
		  // if the underlying field is a static field, the argument is ignored/it may be null 
		  return (sun.misc.Unsafe) field.get(null);
	}

}
