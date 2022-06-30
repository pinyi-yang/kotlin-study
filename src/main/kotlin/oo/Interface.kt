package oo

interface Driveable {
    fun drive()
}

interface Buildable {
    val timeRequired: Int
    var color: String
    fun build()
}

class Car(override var color: String, val size: Int) : Driveable, Buildable {
    override val timeRequired = size * 5000

    override fun drive() {
        println("driving car")
    }

    override fun build() {
        println("build a size ${this.size} $color car needs $timeRequired hours")
    }
}

fun main() {
    val driveable: Driveable = Car("black", 1)
    driveable.drive()

    val car = Car("blue", 5)
    car.drive()
    car.build()
}