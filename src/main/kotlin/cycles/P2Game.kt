package cycles

fun main() {
    val num = (1..9).random()
    println("Type any number")
    while (!readln().equals(num.toString())) {
        println("Type any number")
    }
    println("You've finally made it!")
}
