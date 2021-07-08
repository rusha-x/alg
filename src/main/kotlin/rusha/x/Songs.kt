package rusha.x

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val rus: MutableList<Int> = mutableListOf<Int>()
    val zar: MutableList<Int> = mutableListOf<Int>()
    val n: Int = scanner.nextInt()

    repeat(n) {
        val rusTrack = scanner.nextInt()
        rus.add(rusTrack)
    }

    repeat(n) {
        val zarTrack = scanner.nextInt()
        zar.add(zarTrack)
    }

    val playlist = mutableListOf<Int>()

    repeat(n) { index ->
        val track = rus[index]
        playlist.add(track)

        val track2 = zar[index]
        playlist.add(track2)
    }

    val playlistStrings = mutableListOf<String>()
    playlist.forEach { playlistTrack ->
        playlistStrings.add(playlistTrack.toString())
    }
    val output = playlistStrings.joinToString(separator = " ")
    println(output)
}
