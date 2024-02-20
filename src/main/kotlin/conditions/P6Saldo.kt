package conditions

import kotlin.math.absoluteValue

fun main() {
    val loss = readln().toInt()
    val benefit = readln().toInt()
    val saldo = benefit - loss
    println("Переменные: потери - $loss и прибыль - $benefit")
    println(if (saldo > 0) saldo else "Ваши убытки составили: ${saldo.absoluteValue}")
}