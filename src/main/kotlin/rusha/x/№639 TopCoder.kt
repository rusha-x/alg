package rusha.x

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    val input = mutableListOf<TopCoder>()

    var i = 0
    while (i < n) {
        val ni = scanner.nextInt()
        var w = 0
        while (w < ni) {
            val a = TopCoder(
                score = scanner.nextDouble(),
                name = scanner.next()
            )
            input.add(a)
            w += 1
        }
        i += 1
    }
    input.sortByDescending { a ->
        a.score
    }
    println(input.joinToString(separator = "\n"))
}

class TopCoder(val score: Double, val name: String) {
    override fun toString(): String {
        return "$score $name"
    }

}