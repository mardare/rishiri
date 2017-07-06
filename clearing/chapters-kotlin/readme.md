
# kotlin
[live ide](http://try.kotlinlang.org/)

[official documentation (pdf)](https://kotlinlang.org/docs/kotlin-docs.pdf)
[stackoverflow stats](https://stackoverflow.com/questions/tagged/kotlin)
~~~~
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





