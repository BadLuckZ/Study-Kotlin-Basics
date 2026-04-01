package intermediate

object DoAuth {
    fun takeParams(username: String, password: String) {
        println("input Auth parameters = $username:$password")
    }
}

// data - เก็บข้อมูล
data object AppConfig {
    var appName: String = "My Application"
    var version: String = "1.0.0"
}

class BigBen {
    // companion - static in JAVA
    companion object Bonger {
        fun getBongs(nTimes: Int) {
            repeat(nTimes) { print("BONG ") }
        }
    }
}

fun main(){
    // The object is created when the takeParams() function is called
    DoAuth.takeParams("coding_ninja", "N1njaC0ding!")
    // input Auth parameters = coding_ninja:N1njaC0ding!

    println("=================================")
    println(AppConfig)
    println(AppConfig.appName)
    AppConfig.appName = "My New Application"
    println(AppConfig.appName)

    println("=================================")
    BigBen.getBongs(12)
}