package oop

fun main() {

    //region User 1
    val ob = User("Khaled")
    val ob1 = User("ali", 1998)
    val ob3 = User("omar", 1990, "Aswan")
    val ob4 = User(city = "cairo", username = "tarek", birthday = 1920)
    val ob5 = User(city = "Kina", username = "mohammed")


    val user1 = User(city = "cairo", username = "tarek", birthday = 1920)
    user1.age=9000

    println(user1.age)
    println(User.userCount)
    /**
     * @exception user1.adress="Domiate"because I make set is private
     */
    println(Setting.language)
    Setting.changeLanguageToEnglish()
    println(Setting.language)

    val post=Post("khaled","hello world")
    post.addComment("lol")
    println(post.commentsCount)

    val imagePost=ImagePosts(".Png","Khaled","photo")
    imagePost.imageLink="www.photo.com"
    println("Upload From Internet ${imagePost.printImageLink()}")

    val imagePost2=ImagePosts(".Jpg","Tarek","Hey There  photo ")
    imagePost.imagePath="E/NewFolder/photo${imagePost2.type}"
    imagePost2.selectPhotoFromGallery()

    //polymorphism
    printPostDetails(imagePost2)
    printPostDetails(post)
    // if I want to show Different types of Posts in on list
    val listOfPosts= mutableListOf<BasePost>()
    listOfPosts.add(post)
    listOfPosts.add(imagePost)

    //Type Casting
    showPhoto(imagePost)
    showPhoto(post)

    //Anonymous  object
    object :SendImagePost{
        override fun send() {
            println("Send Photo")
        }
    }

    //data Class
    println(user1.toString())

    //inner class
    User.UserFriend().addFriend()
    User.UserFriend().printCountOfFriends()
    user1.AboutUser().InRelationShip()
    println(user1.relation)


//endregion
}

// add new feature to class it isn't open to inheritance
fun ImagePosts.printImageLink() :String = this.imageLink
fun printPostDetails(mPost:BasePost){
    println(mPost.content)
}
fun showPhoto(mPost:BasePost){
    when(mPost) {
        is Post -> {
            println("No Photo")
        }

        is ImagePosts -> {
            println(mPost.imageLink)
        }
    }

}
fun getTypePost(status:Status):String{
    return when(status){
        is Fail -> "Fail"
        is Loading -> "Loading"
        is Success -> status.list.toString()
    }
}
