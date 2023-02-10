package Reflection


class Property2(var a: Float){
}
fun main(){
    // Constructor Reference
    val y = ::Property2
    println(y.name)
}