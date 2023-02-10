package oop

open class Image (userName :String , content :String)
    : BasePost(userName,content) {
    var imageLink:String=""
    var imagePath:String=""

    // can override and modify it and call it from another class inherit this class
    open fun selectPhotoFromGallery(){
        println("photo.......... $imagePath")
    }
    // can override and modify it and call it from another class inherit this class
    open fun selectPhotoFromInternet(){
        println("photo.......... $imageLink")
    }

    override fun edit() {
        println("Choose your new photo")
    }

}