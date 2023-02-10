
fun main() {

val s: String = readln()
var sts= readln()

    sts = sts

        .replace("VVM", "V*")
        .replace("MMV", "M*")
        .replace("MVM", "M*")
        .replace("VMV", "V*")

        .replace("VXZ","V")
        .replace("WXZ","W")
        .replace("WXV","W")
        .replace("VXV","V")
        .replace("WXW","W")
        .replace("VXW","V")

        .replace("VZY","V")
        .replace("WZY","W")
        .replace("WZX","W")
        .replace("VZX","V")


    var r: Int = sts.count { it == '*' } * 7
    sts=  sts.replace("*","")


    val st = StringBuilder().apply {
        append(sts)
    }



    for (i in st.indices) {
        if (i < st.length) {
            if (st[i] == 'V') {
                r += 5
            } else if (st[i] == 'W') {
                r += 2
            }
            else if (st[i] == 'Y') {
                if (i + 1 < st.length) {
                    val c = st[i + 1]
                    st.deleteCharAt(i + 1)
                    st.append(c)
                }
            }  else {
                if (i + 1 < st.length) {
                    if (st[i + 1] == 'V') {
                        r /= 5
                        st.deleteCharAt(i + 1)
                    } else if (st[i + 1] == 'W') {
                        r /= 2
                        st.deleteCharAt(i + 1)
                    } else {
                        st.deleteCharAt(i + 1)
                    }
                }
            }


        }
    }
    println(r)


}
