package rusha.x

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    val busyBrother = scanner.next().take(n)
    var length = 1

    while (true) {
        val seq = busyBrother.take(length)
        var seqIndex = 0
        var isValid = true
        busyBrother.forEach { curr ->
            if (curr != seq[seqIndex]) {
                if (curr != '#' || curr != '#') {
                    isValid = false
                }
            }
            if (seqIndex < length - 1)
                seqIndex += 1
            else
                seqIndex = 0
        }

        if (isValid) {
            print(length)
            return
        }
        length += 1
    }
}