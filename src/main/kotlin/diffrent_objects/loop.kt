fun main() {
    for (i in 1..20 step 2){
        println(i)
    }
    val list= listOf("dfs","sd","sdf")
    for (i in list){
        println(i)

    }
    list.forEach{
        println(it)
    }


     loop1@   for (i in 1..20 ){
      loop2@      for (j in 1..10){
      //    if(i==2) break@loop1
          if(i==2) break@loop2
                print("${i*j}\t")
            }
         print("\n")
    }
}