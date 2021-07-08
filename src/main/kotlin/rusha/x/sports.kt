package rusha.x

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    val teams = Array(n) { scanner.nextInt() }

    val k = scanner.nextInt()
    val rooms = Array(k) {
        val room = scanner.nextInt()
        val count = scanner.nextInt()
        Room(room, count)
    }

    teams.sortDescending()
    rooms.sortByDescending { room -> room.capacity }

    var roomIndex = 0
    repeat(n) { teamIndex ->
        if (rooms[roomIndex].count == 0) {
            roomIndex++
        }
        if (roomIndex >= rooms.size) {
            print("No")
            return
        }
        val team = teams[teamIndex]
        val room = rooms[roomIndex]
        if (team > room.capacity) {
            print("No")
            return
        }
        rooms[roomIndex].count -= 1
    }

    print("Yes")
}

class Room(
    val capacity: Int,
    var count: Int
)