package collection

fun main() {
    val array = arrayOf("a", "b", "c") //fix length
    val mixed = arrayOf("a", 17, false)
    val number = intArrayOf(1, 2, 3, 4)
//    println(mixed[0])
//    mixed[1] = "abc"
//    println(mixed[1])

    val favFood = listOf("Orange", "Apple", "Banana") // immutable list

    val arrayList = arrayListOf("a", "b", "c") // can add elements
    arrayList.add("e")
    arrayList.add(3, "d")
    println(arrayList)
}