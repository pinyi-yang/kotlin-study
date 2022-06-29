package functions

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7)
    println(reverseList(numbers))
}

fun reverseList (list: List<Int>) : List<Int> {
    val result = arrayListOf<Int>()

    for (index in list.size-1 downTo 0) {
        result.add(list[index])
    }

    return result
}