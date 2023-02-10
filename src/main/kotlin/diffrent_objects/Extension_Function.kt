package diffrent_objects

fun main() {
    fun String.printTriple(){
        for (i in 1..3){
            println(this)
        }
    }
    val name="omar"
    name.printTriple()
}