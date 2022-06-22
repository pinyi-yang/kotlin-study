package loops

fun main() {
    var sum = 0
    for (i in 1..100) {
        sum += i
    }
    print(sum)

    val list = listOf("java", "kotlin", "python")
    for (element in list) {
        println(element)
    }

    for ((index, value) in list.withIndex()) {
        println("Element at $index is $value")
    }

    var result = 0L;
    for (num in 100..100000L) {
        result += num
    }
    println(result)

    println(SumFromTo(100, 100000).result)
}