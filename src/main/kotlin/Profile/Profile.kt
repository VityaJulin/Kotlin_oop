package Profile

class Profile(
    private val id: Int,
    private val login: String,
    private val name: String,
    private val soname: String,
    private var status: String,
    private var avatar: String
) {
    val fullname: String
        get() {
            return "$name $soname"
        }
}