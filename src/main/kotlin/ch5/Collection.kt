package ch5

data class Person1(val name: String, val age: Int)

fun main(args: Array<String>) {
    val list = listOf(1, 2, 3, 4)
    println(list.filter{it % 2 == 0})
    println(list.map{it * it})

    val people = listOf(Person1("Alice", 29), Person1("Bob", 31))
    println(people.map{it.name})
    println(people.map(Person1::name))

    println(people.filter{it.age > 30}.map(Person1::name))
    println(people.filter{it.age == people.maxByOrNull { it.age }?.age}.map{it.name})
}
