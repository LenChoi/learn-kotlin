package ch4

class CopyClient(val name: String, val postalCode: Int) {
    fun copy(name: String = this.name, postalCode: Int = this.postalCode) = CopyClient(name, postalCode)
}

fun main() {
    val lee = CopyClient("이계영", 4122)
    println(lee.copy(postalCode = 4000))
}