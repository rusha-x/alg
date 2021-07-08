package rusha.x

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val input = mutableListOf<Int>()
    val n = scanner.nextInt()

//    repeat(n) {
//        val a = scanner.nextInt()
//        input.add(a)
//    }

    var inputIndex = 0
    while (inputIndex < n) {
        val a = scanner.nextInt()
        input.add(a)
        inputIndex += 1
    }

    val even = mutableListOf<Int>()
    val odd = mutableListOf<Int>()

    var numberIndex = 0
    while (numberIndex < input.size) {
        val a = input.get(index = numberIndex)
        if (a % 2 == 0) {
            even.add(a)
        } else {
            odd.add(a)
        }
        numberIndex += 1
    }
    println(even.joinToString(separator = " "))
    println(odd.joinToString(separator = " "))
    val luckyDays = even.size
    val unluckyDays = odd.size
    if (luckyDays > unluckyDays) {
        println("YES")
    } else {
        println("NO")
    }


}



