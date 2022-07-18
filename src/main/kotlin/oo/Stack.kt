package oo

class Stack<E>(vararg val items: E) {
    val elements = items.toMutableList()

    fun push(element: E) {
        elements.add(element)
    }

    fun pop() = if (elements.isEmpty()) null else elements.removeLast()

    fun peek() = elements.last()
}

fun <T> stackOf(vararg elements: T): Stack<T> {
    return Stack(*elements)
}

fun main() {
    val stack = Stack(3, 5, 2, 8)
    println(stack.peek())
    println(stack.pop())
    println(stack.pop())
    println(stack.pop())
    println(stack.pop())
    println(stack.pop())
    println(stack.pop())

    val stack2 = stackOf("Hi", "Hey", "Hello")

    for (i in 1..3) {
        println(stack2.pop())
    }
}