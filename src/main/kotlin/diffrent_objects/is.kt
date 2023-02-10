fun main(args: Array<String>) {
        val aString: Any = "I am a String"
        val aLong: Any = 42L
        println(    isString(aString)
        )
        println(    isString(aLong)
        )
        println(    isNotString(aString)
        )
        println(    isNotString(aLong)
        )
    }
    fun isString(obj: Any): Boolean = obj is String

    fun isNotString(obj: Any): Boolean = obj !is String
