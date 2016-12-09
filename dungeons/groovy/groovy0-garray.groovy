
def nuArray = ["a", "z", "d"]

nuArray += "b"
println nuArray
//[a, z, d, b]

nuArray -="d"
println nuArray
//[a, z, b]

println nuArray.sort()
//[a, b, z]
