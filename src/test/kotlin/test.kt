import kotlin.test.*

class MainAppTest {

    @Test
    fun testIntroNotNull() {
        assertNotNull(MainApp().intro)
    }

    @Test
    fun testFailingExample() {
        assertFailsWith<IllegalArgumentException> {
            throw IllegalArgumentException("Ejemplo de excepción")
        }
    }
}
