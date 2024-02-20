package basics

fun main() {
    println("Ведите имя и возраст (через пробел)")
    var input = readln().split(" ")
    println("Привет, ${input[0]}! Тебе уже ${input[1]}")
}