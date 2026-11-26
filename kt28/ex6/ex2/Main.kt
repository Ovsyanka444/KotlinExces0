package exes.kt28.ex6.ex2

data class User constructor(val name: String?, val age: Int?)

fun getInfo(user: User): String {
    return "Hi ${user.name?: "person"}!\nYou're age is: ${user.age?: 0}"
}

fun main() {
    val user0 = User(null, 18)

    println(getInfo(user0))
}