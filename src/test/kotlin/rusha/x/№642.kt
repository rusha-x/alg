package rusha.x

import org.junit.Test
import kotlin.test.assertEquals

class Auto {

    @Test
    fun enoughMoney() {
        val count = task642(
            price = mutableListOf(1),
            money = 1
        )
        assertEquals(1, count)
    }
}
