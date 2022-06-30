package oo

open class OpenBase

abstract class Base: OpenBase()

abstract class Person(val name: String, open val age: Int) : Base() {
    init {
        println("init")
    }

    abstract fun speak()

    fun greet(name: String) {
        println("hello $name")
    }
}

class Student(name: String, age: Int, val id: Int) : Person(name, age) {
    override fun speak() {
        println("I am student $id. My name is $name")
    }
}

class Employee(name: String, override var age: Int, var position: String) : Person(name, age) {
    override fun speak() {
        println("I am $name. I am a $position")
    }
}

fun main() {
    val student = Student("Mary", 12, 100001)
    student.speak()
    student.greet("student")

    val employee = Employee("Peter", 32, "Engineer")
    employee.speak()
    println("${employee.name} is ${employee.age} years old in 2022")
    employee.age = 50
    println(employee.age)
}