package study;
// version final
// publish-to https://github.com/mardare/rishiri/tree/master/dungeons/java/src/study
// dependency none

/* 
  	immutable objects in java 
		java.lang.String 
		
		primitive wrapper 
			java.lang.Integer java.lang.Long java.lang.Short java.lang.Double, java.lang.Float
			java.lang.Character
			java.lang.Boolean

	 mutable objects in java
	 	java.util.concurrent.atomic
	 		AtomicInteger, AtomicBoolean, ...
	 other
	 	 org.apache.commons.lang.mutable 
	 	 	MutableBoolean, MutableByte, MutableDouble, MutableFloat, MutableInt, MutableLong, MutableObject, MutableShort.
*/

public class ImmutableStudy {

	public static void main(String[] args) {

		//immutable Chapter
		String s="alpha";
		System.out.format("hash is %s hex %h\n", 
				System.identityHashCode(s), 
				System.identityHashCode(s));

		s="beta";	
		System.out.format("hash is %s hex %h\n", 
				System.identityHashCode(s), 
				System.identityHashCode(s));
		
		System.out.println();
		
		//mutable Chapter
		StringBuilder sMut= new StringBuilder("gamma");
		System.out.format("hash is %s hex %h\n", 
				System.identityHashCode(sMut), 
				System.identityHashCode(sMut));
		
		sMut.setLength(0);
		sMut.append("zetta");

		System.out.format("hash is %s hex %h\n", 
				System.identityHashCode(sMut), 
				System.identityHashCode(sMut));

	}

}
