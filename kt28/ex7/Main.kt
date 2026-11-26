package exes.kt28.ex7

val formsDataList: MutableList<Form> = mutableListOf()

//Этап 7. Мини-проект
//Вариант А: «Анкета пользователя»
fun main() {

    while (true) {
        println("\nForm. Actions: (1) - Take the survey | (2) - Exit")

        var choice: Int? = readln().toIntOrNull()
        while (choice == null) {
            print("Invalid input. Please try again: ")
            choice = readln().toIntOrNull()
        }

        when (choice) {
            1 -> {
                print("You're name: ")
                val name: String = readln()

                print("Now surname: ")
                val surname: String = readln()

                print("And age: ")
                var age: Int? = readln().toIntOrNull()
                while (age == null) {
                    print("Invalid input. Please try again: ")
                    age = readln().toIntOrNull()
                }
                val currentForm = Form(name, surname, age)
                formsDataList.add(currentForm)
                println(currentForm.result())
            }
            2 -> break
            else -> println("Invalid input")
        }
    }
}