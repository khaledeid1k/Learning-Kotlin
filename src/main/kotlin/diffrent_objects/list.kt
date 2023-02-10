fun main() {
    val im_list= listOf("dfs","sd","sdf")
    //immutable  list[0]="s"
    print(im_list)

  val m_list= mutableListOf("dfs","sd","sdf")
      m_list[0]="s"
    print(m_list)

    val Val_list= mutableListOf("dfs","sd","sdf")
     // can't because it val list= mutableListOf("sd","sdf")
      m_list[0]="s"
    print(Val_list)

    var Var_list= mutableListOf("dfs","sd","sdf")
    Var_list= mutableListOf("sd","sdf")
      m_list[0]="s"
    print(Var_list)

    var arr_list= arrayListOf("dfs","sd","sdf")
    arr_list[0]="s"
    print(arr_list)


}