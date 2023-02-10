import java.time.Instant

fun main() {
    val aString: Any = "I am a String"
    val aLong: Any = 42L
    val aList: Any = listOf(1, 2, 3)
    val aDate: Any = Instant.now()
    println(doubleTheValue(aString))
    println(doubleTheValue(aLong))
    println(doubleTheValue(aList))
    println(doubleTheValue(aDate))


}
fun doubleTheValue(obj: Any): Any =
    when (obj) {
        is String -> obj.repeat(2)
        is Long -> obj * 2
        is List<*> -> obj + obj
        else -> "Unsupported Type Found."
    }