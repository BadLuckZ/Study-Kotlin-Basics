class Contact(var id: Int, var name: String, var email: String) {
    fun showId(){
        println("Contact id is $id")
    }
}

fun main() {
    val contact = Contact(1, "Mary", "mary@gmail.com")
    println("${contact.name}'s Email: ${contact.email}")

    contact.email = "mary@hotmail.com"
    println("${contact.name}'s Email: ${contact.email}")

    contact.showId()
}