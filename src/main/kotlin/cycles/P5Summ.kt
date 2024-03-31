package cycles

fun main() {
    println((0..100 step 4).sum())

    var sum = 0
    for (i in 0..100 step 4)
        sum += i
    println(sum)
}