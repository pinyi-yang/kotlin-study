package oo

interface Lendable {
    fun borrow()
}

abstract class InventoryItem(val title: String, val genre: String, val year: Int) : Lendable

class LibraryBook(
    title: String,
    genre: String,
    year: Int,
    val author: String
) : InventoryItem(title, genre, year) {
    override fun borrow() {
        println("borrow $title by $author")
    }
}

fun main() {
    val book = LibraryBook("Test", "test", 2022, "someone")
    println(book.toString())
}