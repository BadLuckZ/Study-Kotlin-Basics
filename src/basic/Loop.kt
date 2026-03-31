package basic

fun main() {
    // for loop
    for (num: Int in 1..5) {
        println(num)
    }

    val cakes: List<String> = listOf("Carrot", "Cheese", "Chocolate")
    for (cake: String in cakes) {
        println("Cake: $cake")
    }

    // while loop
    var cakesEaten: Int = 0
    while (cakesEaten < 5) {
        println("Cake Eaten #${cakesEaten+1}")
        cakesEaten += 1
    }
}