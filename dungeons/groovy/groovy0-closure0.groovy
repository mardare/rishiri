
def doo (txt){
    print txt.toUpperCase()
}
def redoo(txt){
    print txt.toLowerCase()
}

def closure0 = {x ->  doo(x)}

def nuArray = ["a", "z", "d"]
nuArray.each(closure0)
nuArray.each {x -> redoo(x)}

