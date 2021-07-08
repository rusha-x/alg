package rusha.x

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    val chet = mutableListOf<Int>()
    val nechet = mutableListOf<Int>()

    var i = 0
    while (i < n) {
        val a = scanner.nextInt()
        if (a % 2 == 1) {
            nechet.add(a)
        } else {
            chet.add(a)
        }
        i += 1
    }
    println(nechet.joinToString(" "))
    println(chet.joinToString(" "))
    if (chet.size > nechet.size) {
        println("YES")
    } else {
        println("NO")
    }
}