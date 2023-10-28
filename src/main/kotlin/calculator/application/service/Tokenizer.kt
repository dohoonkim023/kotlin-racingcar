package calculator.application.service

class Tokenizer {
    private val DELIMITER = " "

    fun tokenize(expr: String): List<String> {
        return expr.split(DELIMITER)
    }
}
