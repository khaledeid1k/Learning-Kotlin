package Generics

import oop.BasePost
import oop.Image
import oop.ImagePosts

fun main() {
    val parameterizedClass1 = ParameterizedClass("string-value")
    val parameterizedClass2 = ParameterizedClass(5)
    val parameterizedClass3 = ParameterizedClass(3.5)
    val res =  parameterizedClass1.getValue()
    println(res)


    val obj1=
        BoundedGeneric(ImagePosts(".jph","khaled","lol"))
    obj1.file.selectPhotoFromGallery()

    val obj2=
        BoundedGeneric2(ImagePosts(".jph","khaled","lol"))
    /**
     * this is different between using polymorphism and between Bounded Generic
     * here I can't call anything from subclass of BaseFile
     * because file here consider BaseFile but in above file consider T and T now
     * is ImagePosts
     *    obj2.file2.selectPhotoFromGallery()

     */


    val obj3=BoundedGeneric(ImagePosts
        (".jph","khaled","lol"))

    /**
     *     Don't allow
     *     doSomThing1(obj3)
     */
    //subclass in superclass
    val obj4=BoundedGeneric3<ImagePosts>(ImagePosts
        (".jph","khaled","lol"))
    doSomThing2(obj4)

    //superclass in subclass
    val obj5=BoundedGeneric4<BasePost>(ImagePosts
        (".jph","khaled","lol"))
    doSomThing3(obj5)
}

fun doSomThing1(generic:BoundedGeneric<BasePost>){

}
fun doSomThing2(generic:BoundedGeneric3<BasePost>){

}

fun doSomThing3(generic:BoundedGeneric4<Image>){

}