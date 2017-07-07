
# kotlin

[twitter>](https://twitter.com/kotlin) | [src>](https://github.com/jetbrains/kotlin) | [live ide](http://try.kotlinlang.org/)

 - statically typed
 - multi-paradigm
 - coroutines (asynchronous programming)[doc>](https://github.com/Kotlin/kotlin-coroutines/blob/master/kotlin-coroutines-informal.md)
 - compiles on jvm(7,8)/dvm(dalvik), javascript, native (wip) [src>](https://github.com/JetBrains/kotlin-native)
 - extension functions/properties without inheritance [doc>](https://kotlinlang.org/docs/reference/extensions.html)
 - operator overloading [doc>](https://kotlinlang.org/docs/reference/operator-overloading.html)
 - all exceptions are unchecked (no compiler enforcement to catch them) 
 - null safety
 - hejlsbergian syntax
 - function names as a phrase (readable auto-testing e.g. @Test fun ```verify node has sub-nodes```() {...})
 - ~~instance via 'new' keyword~~ 

[official documentation (pdf)](https://kotlinlang.org/docs/kotlin-docs.pdf)|
[stackoverflow stats](https://stackoverflow.com/questions/tagged/kotlin)

[jetbrains kotlin examples](https://github.com/JetBrains/kotlin-examples)  
[hadi hariri oreilly kotlin course](https://github.com/hhariri/oreilly-kotlin-course)  
[antonio leiva blog](https://antonioleiva.com/kotlin/)  
http://jamie.mccrindle.org/2013/01/exploring-kotlin-standard-library-part-1.html  
http://jamie.mccrindle.org/2013/01/exploring-kotlin-standard-library-part-2.html  
http://jamie.mccrindle.org/2013/02/exploring-kotlin-standard-library-part-3.html  
http://kotlination.com/  


~~~~
<dependency><!---->
	<groupId>org.jetbrains.kotlin</groupId>
	<artifactId>kotlin-stdlib</artifactId>
	<version>1.0.4</version>
</dependency>
<dependency>
	<groupId>org.jetbrains.kotlin</groupId>
	<artifactId>kotlin-test-junit</artifactId>
	<version>1.0.4</version>
	<scope>test</scope>
</dependency>
~~~~
  
kotlin-stdlib http://search.maven.org/#search%7Cgav%7C1%7Cg%3A%22org.jetbrains.kotlin%22%20AND%20a%3A%22kotlin-stdlib%22  
kotlin-test-junit http://search.maven.org/#search%7Cgav%7C1%7Cg%3A%22org.jetbrains.kotlin%22%20AND%20a%3A%22kotlin-test-junit%22  

~~~~
   //immutable variable
   val a: Int = 1
   
   fun main(args: Array<String>) {
     val a: Int =1
	 a++  //compilation error Val cannot be reassigned
	}
   
   //mutable variables
	var x: Int = 1
	
   //......
   data class kloss (val f1: String, val f2: String)
   
   //......
   when (obj) {
    is Foo -> ...
    is Bar -> ...
    else   -> ...
    }
    
    //......
    for ((key, val) in map) {
        println("$key -> $val")
    }
    
    //......
    //immutable/read-only map
    val m = mapOf("bwp" to 1000, "pwb" to 2, "wbp" to 31)
    println(m["eur"])
    
    //...............
    fun main(args: Array<String>) {
       println("kotlin easy rider".CamelCase())
        val h= "ello"
        println("H$h")
    }
    fun String.CamelCase(): String {
        println(this.split(Regex("\\s")).map{"$it".capitalize()})
        return this.split(Regex("\\s")).map{"$it".capitalize()}.joinToString(separator = " ")
    }
~~~~

* made in http://dillinger.io/



