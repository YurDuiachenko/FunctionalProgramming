package cycles

fun main() {
    print(
        readln().split(", ")
            .map { it.toInt() }
            .toList().sorted()
    )
}