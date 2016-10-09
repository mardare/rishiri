package study;
// version final
// publish-to https://github.com/mardare/rishiri/tree/master/dungeons/java/src/study
// dependency used by singletonStudyA.java


public class SingletonStudyB {

	// early init
	private static SingletonStudyB _instance=new SingletonStudyB();
	
	// disable new
	private SingletonStudyB(){System.out.println("run contructor "+this.getClass()); };
	
	public static SingletonStudyB getInstance(){
		return _instance;
	}
}
