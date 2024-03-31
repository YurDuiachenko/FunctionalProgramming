package cycles

fun main() {
    for (digit in 1..5)
        for (i in 1..digit)
            print(digit.toString() + "\n".takeIf { i == digit }.orEmpty())
}
