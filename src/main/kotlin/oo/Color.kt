package oo

enum class Color(
    val value: Byte,
    val strValue: String,
) {
    RED(0, "red"),
    BLUE(1, "blue"),
    GREEN(2, "green")
    ;

    override fun toString() = strValue
}

class NewCar(val color: Color) : Driveable {
    override fun drive() {
        println("drive a $color car")
    }
}

fun main() {
    val car = NewCar(Color.BLUE)
    car.drive()
}