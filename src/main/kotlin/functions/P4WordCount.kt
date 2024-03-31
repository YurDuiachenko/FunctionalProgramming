package functions

fun split(str: String): Int {
    return str.split(" ")
        .asSequence()
        .filter { it.isNotBlank() }
        .filter { Character.isAlphabetic(it.first().code)  }
        .map { it.trim()}
        .toList().count()
}

fun main() {
    println(split(readln()))
}