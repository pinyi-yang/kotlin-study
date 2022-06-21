fun main() {
    val age = 15
    val x = if (age < 18) {
        println("You cannot register.")
        17
    } else {
        println("You are good to go")
        20
    }
    println(x);

    val mode: Int = 2

    val message = when (mode) {
        1 -> "the mode is lazy"
        2 -> {
            "the mode is 2"
            "the mode is busy"
        }
        3 -> "the mode is super-produciton"
        else -> "unknown mode"
    }

    println(message)
}