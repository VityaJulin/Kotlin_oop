package Hierarchy

class ViewGroup() : View() {
    private lateinit var view : View
    fun addView(view: View): Boolean {
        this.view = View()
        return true
    }
}