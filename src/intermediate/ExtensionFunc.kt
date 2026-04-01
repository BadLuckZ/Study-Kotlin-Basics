package intermediate

// This is extension function
// named bold()
// for String datatype
fun String.bold(): String {
    return "<b>${this}</b>"
}

// Some random class
class HttpClient {
    fun request(method: String, url: String, headers: Map<String, String>) {
        println("Requesting $method to $url with headers: $headers")
    }

    fun get(url: String) {
        request("GET", url, headers = emptyMap())
    }
}

// This is extension function
// named post()
// for HttpClient Class
fun HttpClient.post(url: String, headers: Map<String, String>) {
    request("POST", url, headers)
}

fun main(){
    println("Hello!".bold())

    val httpClient = HttpClient()
    httpClient.get("http://localhost:8080")
    httpClient.post("http://localhost:8080/hello", mapOf("name" to "James", "age" to "18"))
}