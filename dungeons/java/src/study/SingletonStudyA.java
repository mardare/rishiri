package study;

//singleton defined in singletonStudyB

public class SingletonStudyA {

	public static void main(String[] args) {

//		try {
//		
//			//// testing "new" disabled - throws an uncatchable java.lang.Error
//			//singletonStudyB s= new singletonStudyB();
//		
//		} catch (Throwable t) {
//			System.out.println("...trying to catch a java.lang.Error");
//		} finally {
//			System.out.println("...finally");
//		}
//		


		SingletonStudyB s = SingletonStudyB.getInstance();
		

		
		// SingletonStudyB s2= s.clone(); 	
		// error The method clone() from the type Object is not visible
		//      protected native Object clone() throws CloneNotSupportedException;
		
		SingletonStudyClonable s2=SingletonStudyClonable.getInstance();
		SingletonStudyClonable s2bis=(SingletonStudyClonable) s2.clone();

		System.out.println("end-of-program");
	}

}
