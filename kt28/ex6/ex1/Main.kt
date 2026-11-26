package exes.kt28.ex6.ex1

fun firstChar(text: String?): Char {
    return text?.first()?: '_'
}

fun main() {
    println(firstChar(null))
}