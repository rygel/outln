package com.example

data class Person(val name: String, val age: Int)

data class Point(val x: Int, val y: Int)

fun process() {
    // Destructuring declarations in function body
    val person = Person("Alice", 30)
    val (name, age) = person

    val point = Point(10, 20)
    val (x, y) = point

    // Destructuring in for loop
    val people = listOf(Person("Bob", 25), Person("Carol", 35))
    for ((name, age) in people) {
        println("$name is $age years old")
    }
}

// Function returning Pair (can be destructured)
fun getCoordinates(): Pair<Int, Int> {
    return Pair(10, 20)
}
