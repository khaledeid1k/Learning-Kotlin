package test.tdd

import kotlin.math.ceil
import kotlin.math.round

fun main() {
   println(averageGrowth(18,187))
}
fun averageGrowth(age : Int,height :Int): Any? {
    if(age !in 1..18||height !in 30..210){return null}
    return round((1f*height/age)).toInt()
     }

fun getLargestThreeNumber(inputArray:Array<Int>):Array<Int>?{
    return inputArray.sortedDescending().take(3).toTypedArray()

}



