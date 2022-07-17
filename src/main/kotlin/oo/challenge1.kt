package oo

class Book(val title: String, val author: String, val year: Int, var isBorrowed: Boolean = false) {
    fun getInfo() {
        println("Book Info: title: $title, author: $author, year: $year")
    }
}


fun main() {
    val book = Book("Kotlin", "Someone", 2016)

    book.getInfo()
    println(book.isBorrowed)

    book.isBorrowed = true
    println(book.isBorrowed)
}