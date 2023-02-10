package test.tdd
class Instance{

fun getLargestTwoNumber(inputArray:Array<Int>):Array<Int>? {
    return inputArray.sortedDescending().take(2).toTypedArray()
}

}