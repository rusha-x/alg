package rusha.x

import java.io.PrintWriter
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val writer = PrintWriter(System.out)
    val n = scanner.nextInt()
    var a = scanner.nextInt()
    val price = mutableListOf<Int>()

    var i = 0
    while (i <= n - 1) {
        price.add(scanner.nextInt())
        i += 1
    }
    val result = task642(price, a)
    writer.println(result)
    writer.flush()
}
fun task642(price: MutableList<Int>, money: Int) : Int {
    var count = 0
    var remainedMoney = money
    price.sort()
    var i = 0
    while (i < price.size) {
        val u = price.get(i)
        if (u <= remainedMoney) {
            remainedMoney -= u
            count += 1
        }
        i += 1
    }
    return count
}
