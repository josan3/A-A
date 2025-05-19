package app

import kotlin.test.*
import java.io.IOException

class MainTest {

    @Test
    fun testGreetingIsNotNull() {
        assertNotNull(MainApp().intro)
    }

    @Test
    fun testInvalidInputThrowsException() {
        val ex = assertFailsWith<InvalidInputException> {
            parseInteger("xyz")
        }
        assertEquals("El valor 'xyz' no es un número válido.", ex.message)
    }

    @Test
    fun testOutOfBoundsAccess() {
        assertFailsWith<IndexOutOfBoundsException> {
            accessElement(10)
        }
    }

    @Test
    fun testIOExceptionOnFileRead() {
        val ex = assertFailsWith<IOException> {
            readConfig("no_existe.txt")
        }
        assertEquals("Error al leer el archivo de configuración.", ex.message)
    }

    @Test
    fun testIllegalArgumentException() {
        assertFailsWith<IllegalArgumentException> {
            riskyOperation(-5)
        }
    }
}
