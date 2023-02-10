fun main() {
    val myRange=0..20
    val myRange2= (3).rangeTo(20)
    val myRange3= (50).downTo(20)
    val myRange4= (50).downTo(20).step(3)
    myRange.printAll()
    myRange2.printAll()
    myRange3.printAll()
    myRange4.printAll()

}
fun IntProgression.printAll(){
    this.forEach{
        print(" $it ")
    }
}
