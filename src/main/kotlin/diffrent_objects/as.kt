fun main() {
    val aString: Any = "I am a String"
    val aLong: Any = 42L
    println(unsafeCastToString(aString)
    )
    println(unsafeCastToString(aLong)
    )
}
fun unsafeCastToString(obj: Any): String? = obj as? String