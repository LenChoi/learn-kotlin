package ch4

class User3 (val name: String) {
    var address: String = "unspecified"
        set(value: String) {
            println("""
                Address was changed for $name:
                "$field" -> "$value".
            """.trimIndent())
            field = value
        }
}


fun main() {
    val user = User3("Alice")
    user.address = "Element df"
}
