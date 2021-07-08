package rusha.x

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val user1 = mutableListOf<String>()
    val user2 = mutableListOf<String>()
    val n = scanner.nextInt()

    val mutualFriends = mutableListOf<String>()

    var i = 0
    while (i < n) {
        val a = scanner.next()
        i += 1
        user1.add(a)
    }

    val m = scanner.nextInt()
    var i2 = 0
    while (i2 < m) {
        val b = scanner.next()
        i2 += 1
        user2.add(b)
    }

    var c = 0
    while (c < n) {
        val k = user1[c]
        var t = 0
        c += 1
        while (t < m) {
            val z = user2[t]
            t += 1
            if (k == z)
                mutualFriends.add(k)
        }
    }

    val different = mutableListOf<String>()

    var g = 0
    while (g < m) {
        val s = user2[g]
        var f = 0
        g +=1
        var e = false
        while (f < mutualFriends.size){
            val d = mutualFriends[f]
            f += 1
            if ( d == s )
                e = true
        }
        if(!e) {
            different.add(s)
        }

    }

    user1.sort()
    println(user1)
    println(mutualFriends)
    println(different)
}