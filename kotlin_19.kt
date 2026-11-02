//Этап 6. Задание 1
//fun main() {
//    print("Число: ")
//    var num: Int? = readln().toIntOrNull()
//
//    while (num == null) {
//        print("Попробуйте ещё раз: ")
//        num = readln().toIntOrNull()
//    }
//    println("Корректно: $num")
//}

//Этап 6. Задание 2
//fun main() {
//    val correctPassword: String = "admin123"
//
//    print("Пароль: ")
//    var password: String = readln()
//    while (!(password.toCharArray().contentEquals((correctPassword.toCharArray().sliceArray(0..5))))
//        && !(password.toCharArray().contentEquals((correctPassword.toCharArray().sliceArray(0..6))))
//        && password != correctPassword) {
//        print("Неверный пароль. Попробуйте ещё раз: ")
//        password = readln()
//    }
//    println("Пароль верный")
//}

//Этап 7. Мини-проект
//Вариант А: «Безопасный калькулятор»
import colors.*

var previousResult: Double? = 0.0
var keepResult: Boolean = false
var isFirstAction: Boolean = true

fun calc(op: Int = 0, previous: Double? = null): Double {
    if (previous == null) {
        print("\n${green}Первое число: $reset")
        var left_operand: Double? = readln().toDoubleOrNull()
        print("${green}Второе число: $reset")
        var right_operand: Double? = readln().toDoubleOrNull()

        while (left_operand == null || right_operand == null) {
            println("${red}Неправильный ввод. Попробуйте ещё раз$reset")
            print("${green}Первое число: $reset")
            left_operand = readln().toDoubleOrNull()
            print("${green}Второе число: $reset")
            right_operand = readln().toDoubleOrNull()
        }
        when (op) {
            1 -> return left_operand + right_operand
            2 -> return left_operand - right_operand
            3 -> return left_operand * right_operand
            4 -> return left_operand / right_operand
            5 -> return left_operand / right_operand * 100
            else -> return 0.0
        }
    }
    else {
        print("\n${green}Второе число: $reset")
        var right_operand_to_previous: Double? = readln().toDoubleOrNull()

        while (right_operand_to_previous == null) {
            print("${red}Неправильный ввод. Попробуйте ещё раз: $reset")
            right_operand_to_previous = readln().toDoubleOrNull()
        }
        when (op) {
            1 -> return previous + right_operand_to_previous
            2 -> return previous - right_operand_to_previous
            3 -> return previous * right_operand_to_previous
            4 -> return previous / right_operand_to_previous
            5 -> return previous / right_operand_to_previous * 100
            else -> return 0.0
        }
    }
}

fun check(choice: Int) {
    if (isFirstAction || keepResult == false) {
        previousResult = calc(choice)
        println("${blue}Результат: $previousResult$reset")
        isFirstAction = false
    }
    if (keepResult) {
        previousResult = calc(choice, previousResult)
        println("${blue}Результат: $previousResult$reset")
    }
}

fun main() {
    main_loop@ while (true) {
        if (!isFirstAction) {
            print("\n${green}Хотите ли продолжить выполнять операции с предыдущим результатом?(Д/Н): $reset")
            val isResultNeeded: String = readln().trim().lowercase()

            if (isResultNeeded == "д") keepResult = true
            else {
                previousResult = 0.0
                keepResult = false
            }
        }

        println("\n${green}Калькулятор. Выберите действие\n(1) - Сложение\t(2) - Вычитание\n(3) - Умножение\t" +
                "(4) - Деление\n(5) - Процент\t(6) - Выход$reset")
        var choice: Int? = readln().toIntOrNull()

        while (choice == null) {
            print("\n${red}Некорректный ввод попробуйте ещё раз: ${reset}")
            choice = readln().toIntOrNull()
        }
        when (choice) {
            1 -> check(1)
            2 -> check(2)
            3 -> check(3)
            4 -> check(4)
            5 -> check(5)
            6 -> {
                println("${yellow}\nВыход. . .$reset")
                break@main_loop
            }
            else -> {
                println("${red}Выберите корректное действие!!!$reset")
                break@main_loop
            }
        }
    }
}