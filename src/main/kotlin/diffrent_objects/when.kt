fun main() {
var count=70
    when(count){
        in 20..50->{
            println(20)
            println(50)
        }
        !in 60..100->println("200")
        else-> println("none")
    }
    when(count){
        20->{
            println(20)
            println(50)
        }
        100->println("60")
    }
    val s:String?=when(count){
        20->"20"
        60->"60"
        else-> null
    }
}