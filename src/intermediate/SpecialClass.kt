package intermediate

interface EcoFriendly {
    val emissionLevel: String
}

interface ElectricVehicle {
    val batteryCapacity: Double
}

// open - อนุญาตให้ class หรือ function ถูก override / inherit ได้
open class Vehicle(val make: String, val model: String)
open class Car(make: String, model: String, val numberOfDoors: Int) : Vehicle(make, model)
class ElectricCar(
    make: String,
    model: String,
    numberOfDoors: Int,
    val capacity: Double,
    val emission: String
) : Car(make, model, numberOfDoors), EcoFriendly, ElectricVehicle {
    override val batteryCapacity: Double = capacity
    override val emissionLevel: String = emission
}

// sealed - class ที่จำกัดว่ามี subclass ได้แค่ไหน
sealed class Mammal(val name: String)
class Cat(val catName: String) : Mammal(catName)
class Human(val humanName: String, val job: String) : Mammal(humanName)

fun greetMammal(mammal: Mammal): String {
    when (mammal) {
        is Human -> return "Hello ${mammal.name}; You're working as a ${mammal.job}"
        is Cat -> return "Hello ${mammal.name}"
    }
}

// enum - ใช้เก็บค่าที่มีตัวเลือกตายตัว
enum class Color(val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF),
    YELLOW(0xFFFF00);

    // checks if the hexadecimal value contains FF as its first bits
    fun containsRed() = (this.rgb and 0xFF0000 != 0)
}

// value - class ที่มีค่าเดียว และ optimize memory
@JvmInline
value class Email(val address: String)

fun sendEmail(email: Email) {
    println("Sending email to ${email.address}")
}

// ==========================================================

fun main() {
    println(greetMammal(Cat("Snowy")))
    // Hello Snowy

    println(greetMammal(Human("John", "Carpenter")))
    // Hello John; You're working as a Carpenter

    val red = Color.RED
    println(red.containsRed())              // true
    println(Color.BLUE.containsRed())       // false
    println(Color.YELLOW.containsRed())     // true

    val myEmail = Email("example@example.com")
    sendEmail(myEmail)  // Sending email to example@example.com
}
