fun main(){
/*//BorbSort
    val list = arrayListOf<Int>(1,2,5,6,4,7,9,3,8)
    for(i in 0..list.size-1){
        for(j in 1 until list.size){
            if (list[j] < list[j -1]){
                val temp = list[j]
                list[j] = list[j -1]
                list[j -1] = temp
            }
        }
    }

    list.forEach {
        println(it)
    }*/

    val list  = arrayListOf(1,5,8,7,6,4,3,2)
    /*for(i in 0..list.size-1){
        for (j in 1 until list.size){
            if (list[j] < list[j -1]){
                val temporaria = list[j]
                list[j] = list[j -1]
                list[j -1] = temporaria
            }
        }
    }*/
       list.sort()
       list.forEach {valor ->
            println(valor)
       }


    // FIBONACI       0  1   2   3   4    5
     // 0 1 1 *   2  3   5   8   13   21
    // a b  c
    //   a  b  c
    //      a  b  c
    //         a  b  c
    //            a  b  c

    var a = 0
    var b = 1
    var c = a+b

     print("$a, $b, $c ,")

    for(count in 0..5){
        a = b

        b = c

        c = a+b

       print("$c ,")
    }

    /*for (i in 0..2){
        println(i)
    }*/

}

data class User(var name :String , var isAdmin : Boolean)
enum class CreditCard(val label: String, val descont :Int){
    VISA("Visa",50),
    MASTER("MasterCard",10),
    ELO("Elo",50),
    AMEX("American Express",10)
}