package oop

class ImagePosts(var type : String,userName :String , content :String):
    Image(userName,content) , SendImagePost
{


    override fun selectPhotoFromGallery() {
        println("Choose your photo From Gallery")
        super.selectPhotoFromGallery()

    }

    override fun selectPhotoFromInternet() {
        println("Choose your photo From Internet")
        super.selectPhotoFromInternet()
    }

    override fun send() {
        println("Send Photo")
    }
}