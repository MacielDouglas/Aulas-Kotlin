package one.digitalinnovation.collection

fun main() {
    val values = intArrayOf(2, 3, 4, 1, 10, 7)
    values.forEach {
        println(it)
    }

    println("________________________")
    values.sort()  //imprimi de forma ordenada
    values.forEach {
        println(it)
    }
}