class MainApp

class InvalidInputException(message: String) : Exception(message)

fun parseInteger(input: String): Int {
    return input.toIntOrNull() ?: throw InvalidInputException("Invalid number")
}

fun accessElement(list: List<Int>, index: Int): Int {
    return list[index]
}

fun readConfig(): String {
    throw java.io.FileNotFoundException("Config file not found")
}

fun riskyOperation() {
    throw RuntimeException("Something went wrong")
}
