package functions

fun main() {
    val list = ArrayList<Int>(readln().split(" ").map { it.toInt() }.toList())
    print(
        list.min().let {
            list.remove(it)
            list.min()
        }
    )
}