package rusha.x

import java.util.*
import kotlin.math.absoluteValue

fun main() {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt()
    val b = a.absoluteValue.toString().reversed()
    if (a >= 0)
        println(b.toInt())
    else
        println(b.toInt() * -1)
}

