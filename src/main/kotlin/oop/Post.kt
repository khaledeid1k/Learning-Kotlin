package oop

 class Post(userName :String , content :String) :BasePost(userName, content){
     override fun edit() {
         println("Enter Yor new Post")
     }


 }
