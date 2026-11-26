package exes.kt29.ex6.ex2

data class Car constructor(var brand: String? = null, var color: String? = null, var year: Int? = null)

fun main() {
    val car0 = Car().apply {
        brand = "Audi"
        color = "Orange"
        year = 2008
    }
    println(car0)
}