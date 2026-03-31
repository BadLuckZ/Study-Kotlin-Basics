fun main(){
    // Immutable Map: Map<DataType1, DataType2>
    val readOnlyMenu: Map<String, Int> = mapOf("Apple" to 100, "Kiwi" to 190)
    println("Immutable Map: $readOnlyMenu")

    // Mutable Map: MutableMap<DataType1, DataType2>
    val menu: MutableMap<String, Int> = mutableMapOf("Apple" to 100, "Kiwi" to 190)
    println("Mutable Map: $menu")
    menu["Orange"] = 200
    println("Immutable Map: $menu")
    menu.remove("Orange")
    println("Immutable Map: $menu")

    // Some Attributes in Map
    println("There is/are ${menu.count()} item(s) in this menu.")
    var item = "Apple"
    println("Is $item in menu?: ${menu.contains(item)}")
    println("$item's price: ${menu[item]}")
    item = "Grape"
    println("Is $item in menu?: ${item in menu.keys}")
}