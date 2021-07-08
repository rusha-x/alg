package rusha.x

import kotlin.test.Test
import kotlin.test.assertEquals

class PatternsTest {

    @Test
    fun containsTrue() {
        val s = listOf<Int>(1, 2, 3, 4, 5)
        val n = 4
        val k = contains(g = n, s = s)
        assertEquals(true, k)
    }

    @Test
    fun containsFalse() {
        val s = listOf<Int>(1, 2, 3, 5)
        val n = 4
        val k = contains(n, s)
        assertEquals(false, k)
    }

    @Test
    fun emptyListSum() {
        val s = listOf<Int>()
        val k = sum(s)
        assertEquals(0, k)
    }

    @Test
    fun singleListSum() {
        val s = listOf(1)
        val k = sum (s)
        assertEquals(1, k)
    }

    @Test
    fun listSum() {
        val s = listOf<Int>(1, 2, 3)
        val k = sum (s)
        assertEquals(6, k)
    }

    @Test
    fun reversedList() {
        val s = listOf<Int>(1, 2, 3)
        val k = reverseList(s)
        assertEquals(listOf(3, 2, 1), k)
    }
}
























