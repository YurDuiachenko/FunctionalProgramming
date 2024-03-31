package cycles

fun main() {
    val list = readln().toList().map { it.digitToInt() }
    println(list.count { it % 2 == 0 })
    println(list.count { it % 2 != 0 })
}