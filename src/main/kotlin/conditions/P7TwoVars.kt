package conditions

fun main() {
    val a = readln().toInt()
    val b = readln().toInt()
    println(if (a % 2 == 0 && b % 2 == 0) true else false)
}