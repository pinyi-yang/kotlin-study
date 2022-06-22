package loops

class SumFromTo(val start: Long, val end: Long) {
    val result: Long
        get() {
            var result = 0L
            for (el in this.start..this.end) {
                result += el
            }

            return result
        }
}