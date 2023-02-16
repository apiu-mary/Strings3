fun main(){
var t = "Akirachix"
    println(t[0]+" " + t[2]+" "+ t[3])
   var k = length("abadare")
    println(k.length)

  priny("mary")
    var w = greeting("Glori","20")
    println(w)



}
fun greeting(name:String,age:String):String {
    var name = "Glori"
    var age = "20"

    return " Hi my name is ${name} and I am ${age} years old"
}
fun length(name: String):String{
     var name = "abadare"

    return name
}


fun priny(name: String) {
    val y = "mary"
    if (name.equals(y)) {
        println("thats me")

    } else {
        println("i dont what that is")

    }
}