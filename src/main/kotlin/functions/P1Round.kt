package functions

fun main() {
    println(roundThouthands(1272))
    println(roundThouthands(12720))
    println(roundThouthands(127))
}

fun roundThouthands(number: Int): String {
    val num = number.toString()
    if (num.length < 4)
        return num
    return num.dropLast(3).plus("K")
}