package Hierarchy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class ViewGroupTest {
    @Test
    fun addViewTest() {
        val main = ViewGroup()
        val title = TextView("Main Screen")

        assertEquals(true, main.addView(title))
    }

    @Test
    fun viewTest() {
        val view = View()

        assertEquals("View clicked", view.click())
    }
}