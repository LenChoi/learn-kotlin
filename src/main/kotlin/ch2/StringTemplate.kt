package ch2

fun main(args: Array<String>) {
    val name = if (args.size > 0) args[0] else "Kotlin"
    println("Hello, ${name}님 반가워요")

    if (args.size > 0) {
        println("Hello, ${args[0]}!")
    }
    println("Hello, ${if (args.size > 0) args[0] else "someone"}!")
}