package rusha.x

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val input = mutableListOf<Int>()
    val n = scanner.nextInt()

    var i = 0
    while (i < n) {
        val a = scanner.nextInt()
        input.add(a)
        i += 1
    }
    val l = scanner.nextInt()

    println(contains(g = l, s = input))
    // val c = sum(input)
    //println(c)

}

fun sum(input: List<Int>): Int {
    var s = 0

    var i = 0
    while (i < input.size) {
        val a = input[i]
        i += 1
        s += a
    }
    return s
}

fun contains(g: Int, s: List<Int>): Boolean {
    var m = false

    var i = 0

    while (i < s.size) {
        val a = s[i]
        if (a == g)
            m = true
        i += 1
    }
    return m
}

fun reverseList(s : List<Int>) : List<Int>  {
    val reversedList = mutableListOf<Int>()

    var i = s.size -1
    while (i >= 0) {
        val a = s[i]
        i -= 1
        reversedList.add(a)
    }
    return reversedList

}














