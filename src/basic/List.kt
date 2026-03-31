package basic

fun main() {
    // Immutable List: List<DataType>
    val readOnlyShapes: List<String> = listOf("Triangle", "Square", "Circle")
    println("Immutable List: $readOnlyShapes")

    // Mutable List: MutableList<DataType>
    val shapes: MutableList<String> = mutableListOf("Triangle", "Square", "Circle")
    println("Mutable List: $shapes")
    shapes.add("Pentagon")
    println("New Mutable List: $shapes")
    shapes.remove("Pentagon")
    println("New Mutable List: $shapes")

    // Some Attributes in List
    println("First Item in shapes: ${shapes[0]}")
    println("Last Item in shapes: ${shapes[shapes.count() - 1]}")
    println("Number of Items in shapes: ${shapes.count()}")

    var shape = "Circle"
    println("Is $shape in shapes?: ${shape in shapes}")
    shape = "Octagon"
    println("Is $shape in shapes?: ${shape in shapes}")
}