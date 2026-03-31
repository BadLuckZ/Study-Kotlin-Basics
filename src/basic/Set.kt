package basic

fun main() {
    // Immutable Set: Set<DataType>
    val readOnlyFruits: Set<String> = setOf("Apple", "Banana", "Cherry", "Cherry", "Pineapple")
    println("Immutable List: $readOnlyFruits")

    // Mutable Set: MutableSet<DataType>
    val fruits: MutableSet<String> =  mutableSetOf("Apple", "Banana", "Cherry", "Cherry", "Pineapple")
    println("Mutable List: $fruits")

    fruits.add("Apple")
    println("Immutable List: $fruits")
    fruits.add("Orange")
    println("Immutable List: $fruits")
    fruits.remove("Orange")
    println("Immutable List: $fruits")

    // Some attributes in set
    println("There are ${fruits.count()} fruit(s)")
    var fruit: String = "Apple"
    println("Is $fruit in fruits?: ${fruit in fruits}")
    fruit = "Orange"
    println("Is $fruit in fruits?: ${fruit in fruits}")
}