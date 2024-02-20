package basics

fun main() {
    val days = 2642
    print("Лет: ${days/365}, недель: ${days%365/7}, дней: ${days%365%7}")
}