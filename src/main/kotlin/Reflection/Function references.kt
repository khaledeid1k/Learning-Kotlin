package Reflection

fun add(a: Int,b: Int) : Int{
    return a+b;
}

fun add(a: String,b: String): String{
    return """$a$b"""
}

fun isDivisibleBy3(a: Int): Boolean{
    return a%3 == 0
}
fun main(){
    // Function reference obtained using :: operator
    val ref1: (Int) -> Boolean  = ::isDivisibleBy3
    val array = listOf<Int>(1,2,3,4,5,6,7,8,9)
    println(array.filter(ref1))

    // Function reference obtained for an overloaded function
    // By explicitly specifying the type
    val ref2: (String,String) -> String = ::add;
    println(ref2)

    // Function reference obtained implicitly
    val x = add(3,5)
    println(x)
}
