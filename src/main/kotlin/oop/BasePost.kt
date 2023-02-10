package oop

//can't make object from it
abstract class BasePost(var userName :String , var content :String)  {
    var likeCount=0
        private set

    private val comments= mutableListOf<String>()

    var commentsCount=0
        private set
        get()=comments.size

    fun like(){
        likeCount++
        println("have new like")
    }

    fun addComment(comment :String){
        comments.add(comment)
    }

    // any class inherit from this class should implement this function
    abstract fun edit()

}