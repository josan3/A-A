package app

import java.lang.IllegalArgumentException
import java.lang.NumberFormatException
import java.io.File
import java.io.IOException

class MainApp {
    val intro: String
        get() = "Demostración de gestión de errores en Kotlin"
}

class InvalidInputException(message: String) : Exception(message)

fun parseInteger(input: String): Int {
    return try {
        input.toInt()
    } catch (e: NumberFormatException) {
        throw InvalidInputException("El valor '$input' no es un número válido.")
    }
}

fun accessElement(index: Int): Int {
    val data = listOf(10, 20, 30)
    return data[index]
}

fun readConfig(path: String): String {
    try {
        return File(path).readText()
    } catch (e: IOException) {
        throw IOException("Error al leer el archivo de configuración.")
    }
}

fun riskyOperation(value: Int): Int {
    if (value < 0) {
        throw IllegalArgumentException("No se aceptan valores negativos.")
    }
    return 100 / value
}

fun main() {
    println(MainApp().intro)

    println("\nEjemplo 1: Conversión segura de texto a número")
    try {
        val numero = parseInteger("abc")
        println("Número convertido: $numero")
    } catch (e: InvalidInputException) {
        println("Excepción capturada: ${e.message}")
    }

    println("\nEjemplo 2: Acceso a lista fuera de rango")
    try {
        val valor = accessElement(5)
        println("Elemento: $valor")
    } catch (e: IndexOutOfBoundsException) {
        println("Índice inválido: ${e.message}")
    }

    println("\nEjemplo 3: Lectura de archivo de configuración")
    try {
        val contenido = readConfig("config.ini")
        println("Contenido del archivo: $contenido")
    } catch (e: IOException) {
        println("Error de E/S: ${e.message}")
    }

    println("\nEjemplo 4: Operación aritmética riesgosa")
    try {
        val resultado = riskyOperation(0)
        println("Resultado: $resultado")
    } catch (e: Exception) {
        println("Fallo en operación: ${e.message}")
    } finally {
        println("Fin del bloque try-catch-finally.")
    }
}