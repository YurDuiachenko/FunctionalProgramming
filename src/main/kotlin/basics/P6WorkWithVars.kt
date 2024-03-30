package basics

fun main() {
    println("Ведите имя и возраст (через пробел)")
    val input = readln().split(" ")
    println("Привет, ${input[0]}! Тебе уже ${input[1]}")
}