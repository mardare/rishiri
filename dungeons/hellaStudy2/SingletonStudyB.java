package hellaStudy2;

//singleton implementation
//used by singletonStudyA

public class SingletonStudyB {

	// early init
	private static SingletonStudyB _instance=new SingletonStudyB();
	
	// disable new
	private SingletonStudyB(){System.out.println("run contructor "+this.getClass()); };
	
	public static SingletonStudyB getInstance(){
		return _instance;
	}
}
