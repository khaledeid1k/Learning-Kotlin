package Generics

import oop.ImagePosts

class ParameterizedClass<A>(private val value: A) {

    fun getValue(): A {
        return value
    }
    fun<T> printTwice(a:T,b:T,C:Int):T{
        for (i in 1..2){
            println(a)
        }
        return b
    }

     fun<T,V,E> printThreeTimes(a:T,b:V,c:E):E{
        for (i in 1..2){
            println(a)
        }
        return c
    }

}

