
println "system classloader <${this.class.getCanonicalName()}> cp folders:"
println this.class.classLoader.getURLs().each{println it}

//same as system.grandvader aka this.class.classLoader.getParent().getParent()
println "rootLoader <${this.class.classLoader.rootLoader}> cp folders: "
println this.class.classLoader.rootLoader.URLs

println "system.parent classloader <${this.class.classLoader.getParent()}> cp folders:"
println this.class.classLoader.getParent().URLs.each{println it}

println "system.grandvader classloader <${this.class.classLoader.getParent().getParent()}> cp folders:"
println this.class.classLoader.getParent().getParent().URLs.each{println it}
