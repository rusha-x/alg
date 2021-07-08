package rusha.x

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val input = mutableListOf<Int>()
    val n = scanner.nextInt()

//    val a = 3 % 2 // -> 1
//    val b = 4 % 2 // -> 0

    repeat(n) {
        val a = scanner.nextInt()
        input.add(a)
    }
    val evens = mutableListOf<Int>()
    val odd = mutableListOf<Int>()
    input.forEach { a ->
        if (a % 2 == 1) {
            odd.add(a)
        } else {
            evens.add(a)
        }
    }
    println(odd.joinToString(separator = " "))
    println(evens.joinToString(separator = " "))

    if (evens.size <= odd.size) {
        println("YES")
    } else {
        println("NOT")
    }
}