package massives

fun main() {
    var a = (0..100).random()
    var b = (0..100).random()

    val list = ArrayList<Int>()
    if (b < a) {
        val l = b;
        b = a;
        a = l;
    }
    println("$a $b")

    (a..b).forEach { list.add(it) }
    print(list.joinToString { "$it" })
}
