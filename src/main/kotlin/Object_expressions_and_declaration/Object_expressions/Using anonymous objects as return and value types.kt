package Object_expressions_and_declaration.Object_expressions

class C {
     fun getObject() = object {
        val x: String = "x"
    }
     fun getsdObject(){
        val x: String = "x"
    }

    fun printX() {
        println(getObject())

    }


}





class Cv {

    interface A {
        fun funFromA() {}
    }
    interface B

    // The return type is Any. x is not accessible
    fun  getObject() = object {
        val x: String = "x"
    }

    // The return type is A; x is not accessible
    fun getObjectA() = object: A {
        override fun funFromA() {}
        val x: String = "x"
    }

    // The return type is B; funFromA() and x are not accessible
    fun getObjectB(): B = object: A, B { // explicit return type is required
        override fun funFromA() {}
        val x: String = "x"
    }

}

fun main() {
    val fd=Cv()
    val c=C()
}
