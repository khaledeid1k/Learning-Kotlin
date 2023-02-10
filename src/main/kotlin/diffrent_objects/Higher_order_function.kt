fun main() {
    println( doOperation(5,3,sum))
    println( doOperation(5,3,{n1:Int , n2: Int -> n1*n2 }))
    println( doOperation(5,3,::sum2))
}

fun doOperation(n1 : Int,n2 : Int ,f_sum:(Int,Int)->Int ):Int{
    return f_sum(n1,n2)
}

fun sum2(n1 : Int,n2 : Int):Int{
    return n1+n2
}

val sum={n1:Int , n2: Int -> n1+n2 }