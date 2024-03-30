package massives

fun main() {
    print(
        readln().split(", ")
            .map { it.toInt() }
            .toList().sorted()
    )
}