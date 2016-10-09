package Study;
// version final
// publish-to https://github.com/mardare/rishiri/tree/master/dungeons/java/src/study
// dependency used by singletonStudyA


public class SingletonStudyClonable implements Cloneable {

	// early init
	private static SingletonStudyClonable _instance=new SingletonStudyClonable();
	
	// disable new
	private SingletonStudyClonable(){System.out.println("run contructor "+this.getClass()); };
	
	public static SingletonStudyClonable getInstance(){
		return _instance;
	}
	
	@Override
	//protected native Object clone() throws CloneNotSupportedException;
	protected Object clone() {
		System.out.println("run clone() "+ this.getClass());
		
		return new SingletonStudyClonable();
	}
}
