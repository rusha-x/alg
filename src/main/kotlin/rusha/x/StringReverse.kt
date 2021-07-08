package rusha.x

import java.util.*

fun main() {
   // val input = "1 2 3 4  5"
   // val chars = input.toCharArray()
   // var i = chars.lastIndex
//
   // val result = mutableListOf<Char>()
   // while (i >= 0) {
   //     result.add(chars[i])
   //     i -= 1
   // }
   // println(result.joinToString(""))

    val scanner = Scanner(System.`in`)
    val input = mutableListOf<Int>()
    val n = scanner.nextInt()

    var a = 0
    while (a < n) {
        val c = scanner.nextInt()
        input.add(c)
        a += 1
    }
}