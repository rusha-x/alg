package rusha.x

@Suppress("ReplaceWithOperatorAssignment")
fun main(args: Array<String>) {
    val a = args[0].toInt()
    val b = args[1].toInt()
    when {
        a < b -> println("<")
        a > b -> println(">")
        a == b -> println("=")
    }
}
