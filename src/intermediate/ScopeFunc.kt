package intermediate

class Client() {
    var token: String? = null
    fun connect() {
        println("connected!")
    }
    fun authenticate() {
        println("authenticated!")
    }
    fun getData() : String {
        println("getting data!")
        return "Mock data"
    }
}

class Canvas {
    fun rect(x: Int, y: Int, w: Int, h: Int): Unit = println("$x, $y, $w, $h")
    fun circ(x: Int, y: Int, rad: Int): Unit = println("$x, $y, $rad")
    fun text(x: Int, y: Int, str: String): Unit = println("$x, $y, $str")
}

fun main() {
    // apply{} - return object เหมาะกับการ "set ค่า และ init object พร้อมๆ กัน
    val client = Client().apply {
        token = "asdf"
        connect()
        authenticate()
        getData()
    }

    println("=========================")

    // run{} - จะ return ผลลัพธ์ของ block
    val resultRun: String = client.run {
        token = "asdf"
        connect()
        authenticate()
        getData()
    }

    println(resultRun)

    println("=======================")

    // also{}
    val medals: List<String> = listOf("Gold", "Silver", "Bronze")
    val reversedLongUppercaseMedals: List<String> =
        medals
            .map { item -> item.uppercase() }
            .also { item -> println(item) }
            // [GOLD, SILVER, BRONZE]
            .filter { item -> item.length > 4 }
            .also { item -> println(item) }
            // [SILVER, BRONZE]
            .reversed()
    println(reversedLongUppercaseMedals)
    // [BRONZE, SILVER]

    println("=======================")

    // with{}
    val mainMonitorSecondaryBufferBackedCanvas = Canvas()
    with(mainMonitorSecondaryBufferBackedCanvas) {
        text(10, 10, "Foo")
        rect(20, 30, 100, 50)
        circ(40, 60, 25)
        text(15, 45, "Hello")
        rect(70, 80, 150, 100)
        circ(90, 110, 40)
        text(35, 55, "World")
        rect(120, 140, 200, 75)
        circ(160, 180, 55)
        text(50, 70, "Kotlin")
    }
}