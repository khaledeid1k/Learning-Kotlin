
/*
Lambda expressions provide a concise syntax to define
a function without the fun keyword. You can store a lambda expression directly
in a variable without a function reference on another function.
 */
val trick = {
    println("No treats!")
}

fun trick2() {
    println("No treats!")
}

val treat: () -> Unit = {
    println("Have a treat!")
}

//Use a function as a return type
fun trickOrTreat(isTrick: Boolean): () -> Unit {
    return if (isTrick) {
        trick
    } else {
        treat
    }
}

//Pass a function to another function as an argument
fun trickOrTreat2(isTrick: Boolean, extraTreat: (Int) -> String): () -> Unit {
    return if (isTrick) {
        trick
    } else {
        println(extraTreat(5))
        treat
    }
}

//Nullable function types
fun null_trickOrTreat2(isTrick: Boolean, extraTreat:( (Int) -> String)? ): () -> Unit {
    return if (isTrick) {
        trick
    } else {
        if (extraTreat != null) {
            println(extraTreat(5))
        }
        treat
    }
}

val coins: (Int) -> String = {
    "$it quarters"
}

//val coins: (Int) -> String = { quantity ->
//    "$quantity quarters"
//}

val cupcake: (Int) -> String = {
    "Have a cupcake!"
}
fun main() {

    //To refer to the function as a value,
    // you want to store the function in a variable, not call the function.
    val trickProperty = ::trick
    val trickFunction1 = ::trick2


    // trick now refers to a variable, rather than a function name.
    //function type is  () -> Unit
    val trickFunction2 = trick


//println("No treats!")
    val trickFunction22 = trick2()
//println("No treats!")
    val trickFunction3 = trick()


    val treatFunction = trickOrTreat(false)
    val trickFunction = trickOrTreat(true)



    val f_treatFunction1 =  trickOrTreat2(false, coins)
    val f_trickFunction2 = trickOrTreat2(true, cupcake)
    val f_trickFunction3 = trickOrTreat2(true){ "$it quarters" }


    val n_treatFunction1 =  null_trickOrTreat2(false, coins)
    val n_trickFunction2 = null_trickOrTreat2(true, null)

    //Pass a lambda expression directly into a function
    val n_treatFunction3 = null_trickOrTreat2(false, { "$it quarters" })

    // Use trailing lambda syntax
    val n_treatFunction4 = null_trickOrTreat2(false) { "$it quarters" }


//    println(trickProperty)
//    println(trickFunction1)
//    println(trickFunction2())
//    println(trickFunction22)
//    println(trickFunction3)
  //  treatFunction()
  // trickFunction()

    //    n_treatFunction1()
    //    n_trickFunction2()
   // n_treatFunction3()


}
