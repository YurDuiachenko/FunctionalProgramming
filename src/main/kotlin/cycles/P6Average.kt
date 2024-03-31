package cycles

fun main() {
    print(readln().split(", ")
        .map { it.toInt() }
        .toList()
        .let {
            it.filter { el ->
                el > (it.sum().toDouble() / it.size.toDouble())
            }
        }
    )
}