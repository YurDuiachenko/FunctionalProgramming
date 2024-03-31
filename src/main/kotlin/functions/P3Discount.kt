package functions

import java.util.Locale
fun applyDiscount(price: Double, discount: Double): String {
    return "%.2f".format(Locale.ENGLISH, price.times((100 - discount) / 100.0))
}

fun main() {
    println(applyDiscount(35.98, 40.0))
    println(applyDiscount(100.00, 24.5789))
}