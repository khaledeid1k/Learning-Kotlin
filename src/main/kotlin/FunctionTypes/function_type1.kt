package FunctionTypes

class MyFunction: ()->Unit {

    override fun invoke() {
        println("I am called")
    }
}

fun main(args: Array<String>) {
    val function = MyFunction()
    function() // Prints: I am called

    val greet: ()->Unit = { println("Hello") }
    val square: (Int)->Int = { x -> x * x }
    val producePrinter: ()->()->Unit = { { println("I am printing") } }


    val greet1 = { println("Hello") }
    val square1 = { x: Int -> x * x }
    val producePrinter1 = { { println("I am printing") } }


// Usage
    greet() // Prints: Hello
    println(square(2)) // Prints: 4
    producePrinter()() // Prints: I am printing

// Usage
    greet1() // Prints: Hello
    println(square1(2)) // Prints: 4
    producePrinter1()() // Prints: I am printing



}