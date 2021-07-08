package rusha.x

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val m = scanner.nextInt()
    val matrix = Array(m) {
        Array(m) {
            scanner.nextInt()
        }
    }

    var i = m / 2
    var j = m / 2
    var step = 1
    var direction = Direction.Up
    step@while (true) {
        for (a in 1..step) {
            if (!(0 <= i && i < m && 0 <= j && j < m)) {
                break@step
            }
            println(matrix[i][j])
            when (direction) {
                Direction.Up -> i -= 1
                Direction.Right -> j += 1
                Direction.Down -> i += 1
                Direction.Left -> j -= 1
            }
        }
        when (direction) {
            Direction.Up -> {
                direction = Direction.Right
            }
            Direction.Right -> {
                direction = Direction.Down
                step += 1
            }
            Direction.Down -> {
                direction = Direction.Left
            }
            Direction.Left -> {
                direction = Direction.Up
                step += 1
            }
        }
    }
}

enum class Direction {
    Up, Right, Down, Left
}