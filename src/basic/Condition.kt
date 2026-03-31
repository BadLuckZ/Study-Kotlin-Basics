package basic

fun main() {
    val number: Int
    val checked: Boolean = false
    val checkedAgain: Boolean = false

    // if-else
    if (checked) {
        // "checked" True Condition
        number = 1
    } else if (checkedAgain)  {
        // "checked" False Condition
        // but "checkedAgain" True Condition
        number = 2
    } else {
        // "checked" and "checkedAgain" False Condition
        number = 3
    }
    println("Current Number is $number")

    // when
    val obj: Number = 1
    when (obj) {
        1 -> println("This is one")
        2 -> println("This is two")
        else -> println("This is not 1 and 2")
    }

    // when as expression
    val result: String = when (obj) {
        1 -> "one"
        2 -> "two"
        else -> "this is not one and two"
    }
    println("Result is $result")
}