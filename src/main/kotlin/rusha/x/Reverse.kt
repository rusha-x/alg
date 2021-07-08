package rusha.x

import java.util.*

// 5
// 3 4 5 6 7
//
// 7 6 5 4 3
fun main() {
    val scanner = Scanner(System.`in`)
    val input = mutableListOf<Int>()
    val n = scanner.nextInt()

    repeat(n) {
        val a = scanner.nextInt()
        input.add(a)
    }

    val result = mutableListOf<Int>()
    var i = input.lastIndex
    while (i >= 0) {
        result.add(input[i])
        i -= 1
    }

    println(result.joinToString(separator = " "))
}