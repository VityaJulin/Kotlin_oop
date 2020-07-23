package Hierarchy

import kotlin.test.assertEquals
import kotlin.test.Test

internal class ViewGroupTest {
    @Test
    fun addViewTest() {
        val main = ViewGroup()
        val title = TextView("Main Screen")

        assertEquals(true, main.addView(title))
    }
}