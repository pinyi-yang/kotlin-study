package section8

fun getEBook(booklist: ArrayList<String>): ArrayList<String> {
    val result: ArrayList<String> = ArrayList()
    for (name in booklist) {
        if (name.contains("e")) result.add(name)
    }
    return result
}

fun main() {
    println(getEBook(arrayListOf(
        "efghjdsofij", "dgjhdfogij", "dpsogkpoerkyn", "apwigjdsoigjh"
    )))
}
