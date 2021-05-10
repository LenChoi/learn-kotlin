package ch4

class Client(val name: String, val postalCode: Int) {
    override fun equals(other: Any?): Boolean {
        if (other == null || other !is Client)
            return false
        return name == other.name &&
                postalCode == other.postalCode
    }
    override fun toString() = "Client(name=$name, postalCode=$postalCode)"
    override fun hashCode() : Int = name.hashCode() * 31 + postalCode
}

data class Client2(val name: String, val postalCode: Int)

fun main() {
    val client1 = Client("오현석", 4122)
    println(client1)
}

