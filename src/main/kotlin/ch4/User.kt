package ch4

class User1 (val nickname: String, val isSubscribed: Boolean = true)

fun main(args: Array<String>) {
    val hyun = User1("íě")
    println(hyun.isSubscribed)

    val gye = User1("ęłě", false)
    println(gye.isSubscribed)
}



