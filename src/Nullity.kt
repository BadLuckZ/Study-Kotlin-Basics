fun main() {
    var nonNullString: String = "Hello, World!"
    var nullableString: String? = null

    fun describeString(string: String?): String {
        if (string == null) return "This is a null string"
        return "This string: $string contains ${string.length}"
    }

    println(describeString(nonNullString))
    println(describeString(nullableString))
}