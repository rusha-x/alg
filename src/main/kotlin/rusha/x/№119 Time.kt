package rusha.x

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    val input = mutableListOf<TimeStamp>()

    var i = 0
    while (i < n) {
        val a = TimeStamp(
            hours = scanner.nextInt(),
            minutes = scanner.nextInt(),
            second = scanner.nextInt()
        )
        input.add(a)
        i += 1
    }
    input.sort()
    println(input.joinToString(separator = "\n"))
}

class TimeStamp(val hours: Int, val minutes: Int, val second: Int) : Comparable<TimeStamp> {
    override fun compareTo(other: TimeStamp): Int {
        if (this.hours > other.hours) {
            return 1
        } else if (this.hours < other.hours) {
            return -1
        } else {
            if (this.minutes > other.minutes) {
                return 1
            } else if (this.minutes < other.minutes) {
                return -1
            } else {
                if (this.second > other.second)
                    return 1
                else if (this.second < other.second) {
                    return -1
                } else {
                    return 0
                }
            }
        }
    }

    override fun toString(): String {
        return "$hours $minutes $second"
    }
}