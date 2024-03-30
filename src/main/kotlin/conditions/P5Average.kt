package conditions

fun main() {
    val a = readln()
    val b = readln()
    val c = readln()

    when (setOf(a, b, c).size) {
        1 -> print("Ошибка")
        2 -> {
            print(
                when {
                    (c in (a)..<b + 1) -> a
                    (b in (a)..<c + 1) -> a
                    (c in (b)..<a + 1) -> b
                    (a in (b)..<c + 1) -> b
                    (b in (c)..<a + 1) -> c
                    (a in (c)..<b + 1) -> c
                    else -> "Error"
                }
            )
        }
        else -> {
            print(
                when {
                    (c in (a)..<b + 1) -> c
                    (b in (a)..<c + 1) -> b
                    (c in (b)..<a + 1) -> c
                    (a in (b)..<c + 1) -> a
                    (b in (c)..<a + 1) -> b
                    (a in (c)..<b + 1) -> a
                    else -> "Error"
                }
            )
        }
    }
}