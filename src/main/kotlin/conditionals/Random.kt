package conditionals

import java.util.*

fun main() {
    val random = Random().nextInt(50) + 1;
    val result = when (random) {
        in 1..10 -> "bewteen 1 and 10"
        in 11..20 -> "between 11 and 20"
        in 21..30 -> "between 21 and 30"
        else -> "over 30"
    }

    println("$random $result")
}