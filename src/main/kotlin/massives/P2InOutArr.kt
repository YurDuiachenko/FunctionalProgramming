package massives

fun main() {
    val list = ArrayList<Int>()
    list.addAll(listOf(8, 21, 5, 90, 11, 0))
    list[0] = 90
    list.remove(4)
    list.add(-35)
    print(list)
}