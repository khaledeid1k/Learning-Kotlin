package diffrent_objects

fun main() {
    //Lambda expression returns value of the last
    // statement in its body or Unit. Unlabeled return
    // is not working there:
    val getMessage = { response: Response ->
        if(response.code !in 200..299) {
       //     return "Error" // Error! Not allowed
        }
        response.message
    }


    val getMessage1 = lambda@ { response: Response ->
        if(response.code !in 200..299) {
            return@lambda "Error"
        }
        response.message
    }
    val greet= {"Hello"}
    fun greet1(): () -> Unit = {  println("Hello1") }
    fun greet2() = {  println("Hello2") }
    fun greet3() = println("Hello3")
    fun greet4() = fun() { println("Hello4") }
        val greet5= {n : Int , n2:Int -> n+n2 }
    val greet6:(Int , Int ) ->Int= {n  , n2 -> n+n2 }

    println( greet())
    greet1()()
    greet2()()
    greet3()
    greet4()()
    println( greet5(1,5))
    println( greet6(1,5))
}

class Response {

    val message: Any="s"
    val code: Int=0
}
