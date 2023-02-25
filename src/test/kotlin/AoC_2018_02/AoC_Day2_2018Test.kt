
package AoC_2018_02

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class AoC_Day2_2018Test {

    private val aocDay2 = AoC_Day2_2018()

    @Test
    fun duplicateCountTest() {
        val input = listOf("abc", "def", "aabc", "adeff", "aaabbc")
        val expected = 3
        assertEquals(expected, aocDay2.duplicateCount(input))
    }

    @Test
    fun getCorrectBoxIDTest() {
        val input = listOf("abcde", "fghij", "klmno", "pqrst", "fguij", "axcye", "wvxyz")
        val expected = "fgij"
        assertEquals(expected, aocDay2.getCorrectBoxIDS(input))
    }
}
