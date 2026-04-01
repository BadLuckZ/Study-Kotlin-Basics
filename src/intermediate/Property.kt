package intermediate

class Item {
    var name: String = ""
        // โดยปกติแล้วจะมี get() set() อยู่แล้ว แต่ถ้าจะ custom ก็สามารถเรียกออกมาได้
        get() = field
        set(value) {
            field = value.replaceFirstChar { firstChar -> firstChar.uppercase() }
        }
}

data class Person(val firstName: String, val lastName: String, val age: Int)
val Person.fullName: String
    get() = "$firstName $lastName ($age)"

fun Person.getAge(): Int {
    return age
}

fun main() {
    val item = Item()
    item.name = "kodee"
    println(item.name) // Kodee

    val person = Person("John", "Doe", 18)
    println(person.fullName)
    println(person.getAge())
}