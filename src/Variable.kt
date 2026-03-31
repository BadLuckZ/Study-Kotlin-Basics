fun main() {
    // "val" is like "const" in typescript - Immutable
    val popcorn = 5
    // popcorn = 7

    // "var" is like "let" in typescript - Mutable
    var customers = 10
    customers = 8

    // $ as fstring to insert variable in string
    val dogs = 4
    println("There are $dogs dog(s).")
}