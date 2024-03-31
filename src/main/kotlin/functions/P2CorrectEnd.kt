package functions

import java.lang.Exception

fun Int.Companion.withCorrectedSuffix(num: Int): String {
    if (num < 0) throw Exception("Age cannot be negative or equals to zero")
    return when (num.toString().last().digitToInt()) {
        1 -> "$num год"
        in 2..4 -> "$num года"
        in 5..9 -> "$num лет"
        else -> {
            "Something went wrong"
        }
    }
}

fun Int.withCorrectSuffix(): String {
    if (this < 0) throw Exception("Age cannot be negative or equals to zero")
    return when (this.toString().last().digitToInt()) {
        1 -> "$this год"
        in 2..4 -> "$this года"
        in 5..9 -> "$this лет"
        else -> {
            "Something went wrong"
        }
    }
}

fun main() {
    println(1.withCorrectSuffix())
    println(24.withCorrectSuffix())
    println(248.withCorrectSuffix())
    println(19.withCorrectSuffix())
//    println((-19).withCorrectSuffix())


    println(Int.withCorrectedSuffix(1))
    println(Int.withCorrectedSuffix(24))
    println(Int.withCorrectedSuffix(248))
    println(Int.withCorrectedSuffix(19))
//    println(Int.withCorrectedSuffix(-19))
}