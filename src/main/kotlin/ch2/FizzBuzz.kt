package ch2

fun fizzBuzz(i: Int) = when {
    i % 15 == 0 -> "FizzBuzz "
    i % 3 == 0 -> "Fizz "
    i % 4 == 0 -> "Buzz "
    else -> "$i "
}



fun main(args: Array<String>) {
    for (i in 1..100) {
        print(fizzBuzz(i))
    }

    for  (i in 100 downTo 1 step 2) {
        print(fizzBuzz(i))
    }
}