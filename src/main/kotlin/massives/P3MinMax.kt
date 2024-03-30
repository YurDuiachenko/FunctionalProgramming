package massives

fun main() {
    var list = ArrayList<Int>()
    list.addAll(setOf(24, -63, 67, -12, 88, 94, -28, 82, 0, 53))
    print("${list.min()} ${list.max()}")
}