package ch3

var opCount = 0
const val UNIX_LINE_SEPARATOR = "\n"

fun performOperation() {
    opCount++
}

fun repostOperationCount () {
    println("Operation performed $opCount times")
}