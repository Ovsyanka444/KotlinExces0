package exes.kt29.ex7

//Этап 7. Мини-проект
//Вариант Б: «Построитель отчёта»
val reportStorage: MutableList<Report> = mutableListOf()

fun main() {

    while (true) {
        println("Report-maker. (1) - Write a report | (2) - Exit")

        var choice: Int? = readln().toIntOrNull()
        while (choice == null) {
            print("Invalid input. Please try again: ")
            choice = readln().toIntOrNull()
        }

        when (choice) {
            1 -> {
                print("Topic: ")
                val topic: String? = readlnOrNull()

                print("You're e-mail: ")
                val email: String? = readlnOrNull()

                print("Type you're report here_")
                val content: String? = readlnOrNull()

                println("Press enter to continue_")
                readln()

                val currentReport = Report().apply {
                    this.topic = topic
                    this.email = email
                    this.content = content
                }
                reportStorage.add(currentReport)
                reportStorage.last().showMyReport()
            }
            2 -> break
            else -> println("Invalid input")
        }
    }
}