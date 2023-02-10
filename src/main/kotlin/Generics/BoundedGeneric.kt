package Generics

import oop.BasePost

class BoundedGeneric <T :BasePost>(var file:T){
fun doSomeThing(file: T){}
}
class BoundedGeneric2(var file2:BasePost) {
    fun doSomeThing(file: BasePost){}
}

class BoundedGeneric3 <out T :BasePost>(var file:BasePost){
    fun doSomeThing(file: BasePost){}
}
class BoundedGeneric4 <in T >(var file: @UnsafeVariance T){
    fun doSomeThing(file: T){}}





