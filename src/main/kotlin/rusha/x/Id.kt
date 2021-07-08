package rusha.x

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val ids: MutableList<Int> = mutableListOf()
    val n: Int = scanner.nextInt()

    repeat(n - 2) {
        val id = scanner.nextInt()
        ids.add(id)
    }

    val result = mutableListOf<Int>()

    (1..n).forEach { i ->
        if (!ids.contains(i)) {
            result.add(i)
        }
    }
    println(result.joinToString(separator = " "))
}

