fun sum(a: Int, b: Int): Int {
    return a + b
}

fun hello(name: String = "Someone") {
    println("Hello $name!")
}

fun main(){
    val num1: Int = 3
    val num2: Int = 5
    val result = sum(num1, num2)
    println("$num1 + $num2 = $result")

    hello()
    val myName: String = "John"
    hello(myName)

    // Lambda Expression
    val upperCaseString = {text: String -> text.uppercase()}
    println(upperCaseString("tESteR1"))

    val numbers: List<Int> = listOf(-2, -1, 0, 1, 2, 3, 4, 5)
    val isNegative = {number: Int -> number < 0}

    // .filter()
    val positiveNumbers = numbers.filter({number: Int -> number > 0 })
    println(positiveNumbers)
    val negativeNumbers = numbers.filter(isNegative)
    println(negativeNumbers)

    // .map()
    val doubleNumbers = numbers.map({number: Int -> number * 2})
    println(doubleNumbers)
}