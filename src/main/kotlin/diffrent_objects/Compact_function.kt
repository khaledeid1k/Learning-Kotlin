import kotlin.system.exitProcess

fun main() {
    lol()
    println(p())
    println(printName("omar"))
    println(printName())
    println(sum(5))
}

var d = 5
fun lol() = d++
fun p() = d

fun printName(name: String = "Default value"): String = "Hello $name"
fun sum(number1: Int, number2: Int = 0): String = "Sum ${number1 + number2}"
