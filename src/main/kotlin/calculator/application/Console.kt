package calculator.application

import calculator.utill.ValidationRegex

class Console {
    fun enterExpression(): String {
        println("입력해 주세요.")
        val input: String = readln()

        if (isValidInput(input)) {
            return input
        } else {
            throw IllegalArgumentException()
        }
    }

    fun out(result: String) {
        println(result)
    }

    fun isValidInput(input: String?): Boolean {
        if (input.isNullOrBlank()) {
            throw IllegalArgumentException("입력 값이 없습니다.")
        }
        if (!input.matches(ValidationRegex.EXPRESSION_REGEX)) {
            throw IllegalArgumentException("올바르지 않는 형식입니다.")
        }
        return true
    }
}
