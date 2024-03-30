package conditions

import wres.Error

fun main() {
    println(
        """
        У вас есть числа: 2 и 6
        1. Добавить
        2. Отнять
        0. Ничего
        """.trimIndent()
    )

    val a = 2
    val b = 6
    val choice = readln().toInt()
    print(
        when (choice) {
            1 -> a + b
            2 -> a - b
            0 -> ""
            else -> Error.kyky
        }
    )
}