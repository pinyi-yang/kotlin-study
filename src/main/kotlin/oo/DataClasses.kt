package oo

data class DataBook(val title: String, val author: String, val year: Int, var prices: Double)

fun main() {
    val book = DataBook("Super Book", "John", 2017, 99.99)
    val book2 = DataBook("Super Book", "John", 2017, 99.99)
    val book3 = book.copy(prices = 79.99)

    println(book)
    println(book.equals(book2))
    println(book3)
    println(book.hashCode())
}