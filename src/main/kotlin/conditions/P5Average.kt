package conditions

fun main() {
    val a = (0..100).random()
    val b = (0..100).random()
    val c = (0..100).random()
    println(listOf(a, b, c).joinToString(" "))

    if (setOf(a, b, c).size != 3)
        print("Ошибка")

    print(
        when {
            (c in (a + 1)..<b) -> c
            (b in (a + 1)..<c) -> b
            (c in (b + 1)..<a) -> c
            (a in (b + 1)..<c) -> a
            (b in (c + 1)..<a) -> b
            (a in (c + 1)..<b) -> a
            else -> ""
        }
    )
}