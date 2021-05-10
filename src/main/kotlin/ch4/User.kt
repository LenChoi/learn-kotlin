package ch4

class User1 (val nickname: String, val isSubscribed: Boolean = true)

fun main(args: Array<String>) {
    val hyun = User1("현석")
    println(hyun.isSubscribed)

    val gye = User1("계영", false)
    println(gye.isSubscribed)
}



