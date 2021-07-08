package rusha.x

fun main() {
    val input = "1 2 3 4 5"
    val ints = input.split(" ").map { s ->
        s.toInt()
    }
    println(ints)
}