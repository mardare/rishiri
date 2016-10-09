package study;
// version final
// publish-to https://github.com/mardare/rishiri/tree/master/dungeons/java/src/study
// dependency none

/* 
  	premise
		by value => decoupled, changing the value does not transmit to the original variable 
		by ref => coupled/direct-link-to-original-variable, changing the value transmits to the original variable 
		
		by value which is a ref => hybrid which still allows for the direct-link if the ref is to a mutable object with set (change state) methods... 
								   this would not be possible in a simple "by value" premise

	javs is by ref or by val hints?
		primitive types are not reference types => void do(int i) would not be possible without by val since int is not a ref type
*/
import java.util.ArrayList;

public class RefStudy {

	//byRef Chapter
	
	// pattern output-param
	void increment(int i){ ++i;}	
	void increment(Integer i) {	++i; }
	// pattern return-param
	int incrementReturn(int i) {return ++i;}
	
	void incrementRefactored (Integer i) {
		//nothing more than a local assignment
		i = new Integer(i.intValue() + 1);
	}

	Integer incrementByValueClassic (final Integer i) { return i+1;}

	//byValueWhichIsRef Chapter
	
	// Integer is immutable, so no set method, a mutable Integer is required 
	void incrementByValueWhichIsRef (final java.util.concurrent.atomic.AtomicInteger i) { i.incrementAndGet();};
	
	public static void main(String[] args) {

		Integer i = new Integer(10);
		System.out.format("start from %s\n", i);
		
		// if by ref => should increment
		new RefStudy().increment(i);
		System.out.format("= Integer++ result %s\n", i);
		
		i = 11;
		System.out.format("re-start from %s\n", i);
		
		// if by ref => should increment since you re-assign the ref
		new RefStudy().incrementRefactored(i);
		System.out.format("= new Integer++ result %s\n", i);
		
		//solution 1, "bypass"-limitation solution
		i = new RefStudy().incrementByValueClassic(i);
		System.out.format("return Integer++ result %s\n", i);
		
		//solution 2, address-the-problem solution
		java.util.concurrent.atomic.AtomicInteger j = new java.util.concurrent.atomic.AtomicInteger(i);
		new RefStudy().incrementByValueWhichIsRef(j);
		System.out.format("return Integer++ result %s\n", j);
		
		java.util.List mutableList = new ArrayList<Integer>() ;
		mutableList.add(i);
		mutableList.set(0, (Integer) mutableList.get(0)+1);
		
		System.out.format("return ArrayList result %s\n", mutableList.get(0));
	}

}