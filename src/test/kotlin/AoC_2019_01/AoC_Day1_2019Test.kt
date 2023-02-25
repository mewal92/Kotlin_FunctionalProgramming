package AoC_2019_01

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class AoC_Day1_2019Test {

    private val aocDay1 = AoC_Day1_2019()

    @Test
    fun calculateFuelTest() {
        assertEquals(2, aocDay1.calculateFuel(12))
        assertEquals(2, aocDay1.calculateFuel(14))
        assertEquals(654, aocDay1.calculateFuel(1969))
        assertEquals(33583, aocDay1.calculateFuel(100756))
    }

    @Test
    fun fuelListTest() {
        val list = listOf("12", "14", "1969", "100756")
        assertEquals(34241, aocDay1.fuelList(list))
    }

    @Test
    fun fuelWithFuelTest() {
        assertEquals(2, aocDay1.fuelWithFuel(14))
        assertEquals(966, aocDay1.fuelWithFuel(1969))
        assertEquals(50346, aocDay1.fuelWithFuel(100756))
    }
}
