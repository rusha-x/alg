package rusha.x

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val input = mutableListOf<Int>()
    val n = scanner.nextInt()

    var inputIndex = 0
    var sum = 0
    var min = Int.MAX_VALUE
    var max = Int.MIN_VALUE
    while (inputIndex < n) {
        val a = scanner.nextInt()
        input.add(a)
        inputIndex += 1
        if (a >= 0) {
            sum = +a
        }
        if (a < min) {
            min = a
        }
        if (a > max) {
            max = a
        }
    }
    println(min * max)

}