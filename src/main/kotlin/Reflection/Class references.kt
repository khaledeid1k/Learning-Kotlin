package Reflection
class  lol{}
fun main() {

    val obj = lol()

    val s=lol::class.java
    val kClass2 = obj::class.java


    val kClass3 = obj::class
    val kClass1 = obj.javaClass.kotlin
    val sa=lol::class


    println(s)
    println("This is a class reference $sa")
    println(kClass1)
    println(kClass2)
    println("This is a bounded class reference $kClass3")




    val function = MyFunction()
    function() // Prints: I am called

    val greet = ::greetFunction


    fun isOdd(x: Int) = x % 2 != 0
    val numbers = listOf(1, 2, 3)
    println(numbers.filter((::isOdd)))
    println(numbers.filter{ss->ss%2!=0})

    val isEmptyStringList: List<String>.() -> Boolean = List<String>::isEmpty

    fun <A, B, C> csompose(f: (B) -> C, g: (A) -> B): (A) -> C {
        return { x -> f(g(x)) }
    }
    fun length(s: String) = s.length

    val oddLength = csompose(::isOdd, ::length)
    val strings = listOf("a", "ab", "abc")

    println(strings.filter(oddLength))

}
class MyFunction: ()->Unit {

    override fun invoke() {
        println("I am called")
    }

}

fun greetFunction() {
    println("Hello")
}
