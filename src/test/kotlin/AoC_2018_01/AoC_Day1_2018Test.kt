package AoC_2018_01

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class AoC_Day1_2018Test {

    @Test // TEST FÖR FÖRSTA DELEN
    fun count(): Unit {

        val input = listOf(-3, +5, +1, -10, +3)

        //input.sum()
        assertEquals(-4, input.sum())   // test returns true
        assertNotEquals(-8, input.sum())   // test returns false
    }

    @Test // TEST FÖR ANDRA DELEN
    fun firstFrequencyReachedTwice() {
        val lister = listOf(+8, -6, +12, -12)
        val setOfNumbers = mutableSetOf(lister)
        var start = 0

        assertEquals(2, 2)

    }
}