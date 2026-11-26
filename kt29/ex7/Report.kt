package exes.kt29.ex7

data class Report(var topic: String? = null, var email: String? = null, var content: String? = null) {
    fun showMyReport(): String {
        return "Topic: ${topic?: "Unnamed topic"}\nBy: ${email?: "Anonymous person"}\n\n${content?: "\". . .Empty topic. . .\""}".also {
            println("Topic: ${topic?: "Unnamed topic"}\nBy: ${email?: "Anonymous person"}\n\n${content?: "\". . .Empty topic. . .\""}\n")
        }
    }
}