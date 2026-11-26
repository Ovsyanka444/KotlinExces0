package exes.kt28.ex7

data class Form constructor(val name: String?, val surname: String?, val age: Int?) {

    fun result(): String {
        return "\n*You're answers to questions*\nThank you for taking the survey!\n" +
                "\nData that will be used for our statistics:\nName: ${name?: "Unnamed person"}\tSurname: ${surname?: "NoData"}\tAge: ${age?: 18}"
    }
}