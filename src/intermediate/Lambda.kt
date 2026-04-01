package intermediate

class MenuItem(val name: String)

class Menu(val name: String) {
    val items = mutableListOf<MenuItem>()

    fun item(name: String) {
        items.add(MenuItem(name))
    }
}

fun menu(name: String, init: Menu.() -> Unit): Menu {
    // Creates an instance of the Menu class
    val menu = Menu(name)
    // Calls the lambda expression with receiver init() on the class instance
    menu.init()
    return menu
}

fun printMenu(menu: Menu) {
    println("Menu: ${menu.name}")
    menu.items.forEach { item: MenuItem -> println("  Item: ${item.name}") }
}

fun main() {
    // Create the menu
    val mainMenu = menu("Main Menu") {
        // Add items to the menu
        item("Home")        // mainMenu.item("Home")
        item("Settings")    // mainMenu.item("Settings")
        item("Exit")        // mainMenu.item("Exit")
    }

    printMenu(mainMenu)
    //   Menu: Main Menu
    //      Item: Home
    //      Item: Settings
    //      Item: Exit
}