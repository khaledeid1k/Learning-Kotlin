package oop

import javax.management.relation.Relation

data class User(var  username :String,
           var birthday :Int=1900,
           var city:String ?=null
) {
 var relation :Boolean=false
var age :Int = 0
    set(value){
        field =if(value in 1..1999){
            value
        }else{
            0
        }
    }

    //to prevent to modify on it
    var adress :Int = 0
        get() =field
        private  set

init {
    age=2023-birthday
    userCount++
}
    companion object{
        var userCount =0
    }

    // in this class I can't use anything from outer class
    class UserFriend(){
        private var countFriends=0
        fun addFriend(){
            countFriends++
        }
        fun printCountOfFriends(){
            println(countFriends)
        }

    }

    // in this class I can use anything from outer class
    inner class AboutUser(){
        fun InRelationShip(){
            relation=true
        }
        fun printStatus(){
            println(relation)
        }
    }
}
