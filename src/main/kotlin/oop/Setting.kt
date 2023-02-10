package oop

//to prevent to make two object from it
object Setting {
    var language =Language.Arabic
        private set
    fun logOut(user: User){
        println("user ${user.username} logout")
    }
    fun changeLanguageToEnglish(){
        language=Language.English}



}