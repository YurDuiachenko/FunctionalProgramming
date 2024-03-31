package cycles

import kotlin.math.sqrt

fun main() {
    with(readln().toInt()) {
        (1..sqrt(this.toDouble()).toInt()).forEach { el ->
            print("$el ".takeIf { this % el == 0 }.orEmpty())
        }
        print(this)
    }
}