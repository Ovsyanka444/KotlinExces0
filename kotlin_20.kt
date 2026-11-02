//Этап 7. Мини-проект
//Вариант А: «Мини-игра с инвентарем»
import colors.*

val clicker_inventory: Map<Int, Map<Int, Int>> = mapOf(1 to mapOf(1 to 0), 2 to mapOf(2 to 15), 3 to mapOf(5 to 100),
    4 to mapOf(10 to 200), 5 to mapOf(100 to 500))
var count: Int = 0
var mul_choice: Int = 1

fun checker() {
    val reader: Int? = readln().toIntOrNull()
    if (reader in 1..5 && count >= clicker_inventory[reader]?.values?.firstOrNull()!!) {
        mul_choice = clicker_inventory[reader]!!.keys.first()
        println("\n${cyan}Множитель ${clicker_inventory[reader]?.keys?.firstOrNull()!!}X активирован$reset")
    }
    else {
        if (mul_choice == 1) {
            count = count + 1
            print("${blue}$count${reset}_")
        }
        else {
            count = count * mul_choice
            print("${blue}$count${reset}_")
        }
    }
}

fun main() {
    println("${green}Это кликер. Нажимайте \"Enter\" для получения очков\n" +
            "При достижении определённого уровня очков вы сможете выбрать определённый множитель\n(1) - 1X\t(2) - 2X\t(3) - 5X\t" +
            "(4) - 10X\t(5) - 100X$reset")
    while (true) {
        checker()
    }
}