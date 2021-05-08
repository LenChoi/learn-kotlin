package ch3

open class View {
    open fun click() = println("View clicked")
}
class Button: View() {
    override fun click() = println("Button clicked")
}

fun View.showOff() = println("I'm a view!")
fun Button.showOff() = println("I'm a button!")

val String.lastChar: Char
    get() = get(length - 1)

var StringBuilder.lastChar: Char
    get() = get(length - 1)
    set(value: Char) {
        this.setCharAt(length -1, value)
    }


fun main(args: Array<String>) {
    val view: View = Button()
    view.click()
    val view2: View = Button()
    view2.showOff()

    println("Kotlin".lastChar)
    val sb = StringBuilder("Kotlin?")
    sb.lastChar = '!'
    println(sb)
}