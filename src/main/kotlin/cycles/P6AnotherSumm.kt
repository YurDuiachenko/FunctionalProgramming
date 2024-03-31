package cycles

fun main() {
    println((5..57).sum() - (34 + 46 + 52))

    var i = 5
    var sum = 0
    while (i < 58) {
        sum += i
        i++
    }
    println(sum - (34 + 46 + 52))
}