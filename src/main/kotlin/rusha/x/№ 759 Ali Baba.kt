package rusha.x

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    val m = scanner.nextInt()
    val input = mutableListOf<Int>()

    var i = 0
    while (i < n) {
        val a = scanner.nextInt()
        input.add(a)
        i += 1
    }
    input.sort()
    var max = 0
    var y = 0
    while (y < m) {
        val b = input.get(y)
        max += b
        y += 1
    }
    println(max)

}