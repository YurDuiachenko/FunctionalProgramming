package functions

import java.lang.Exception

fun Int.withCorrectSuffix(): String {
    if (this < 0) throw Exception("Age cannot be negative or equals to zero")
    return when (this.toString().last().toString().toInt()) {
        1 -> "$this год"
        in 2..4 -> "$this года"
        in 5..Int.MAX_VALUE -> "$this лет"
        else -> {
            "Something went wrong"
        }
    }
}

fun main() {
    println(1.withCorrectSuffix())
    println(21.withCorrectSuffix())
    println(24.withCorrectSuffix())
    println(248.withCorrectSuffix())
    println(19.withCorrectSuffix())
    println((-19).withCorrectSuffix())
}