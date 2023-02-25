package Tomteland

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*
import java.util.*

class TomtelandTest {


    @Test
    fun getMyran() {
        val tomteland = Tomteland()
        val underlings = tomteland.getUnderlings("Myran")
        assertEquals(listOf("Bladlusen"), underlings)
    }

    @Test
    fun getRäven() {
        val tomteland = Tomteland()
        val underlings = tomteland.getUnderlings("Räven")
        assertEquals(listOf("Gråsuggan", "Myran", "Bladlusen"), underlings)
    }
    @Test
    fun getSkumtomten() {
        val tomteland = Tomteland()
        val underlings = tomteland.getUnderlings("Skumtomten")
        assertEquals(listOf("Dammråttan"), underlings)
    }

    @Test
    fun getButter() {
        val tomteland = Tomteland()
        val underlings = tomteland.getUnderlings("Butter")
        assertEquals(listOf("Rådjuret", "Nyckelpigan", "Haren", "Räven", "Gråsuggan", "Myran", "Bladlusen"), underlings)
    }

    @Test
    fun getGlader() {
        val tomteland = Tomteland()
        val underlings = tomteland.getUnderlings("Glader")
        assertEquals(listOf("Trötter", "Blyger", "Tröger", "Skumtomten", "Dammråttan"), underlings)
    }

    @Test
    fun getTrötter() {
        val tomteland = Tomteland()
        val underlings = tomteland.getUnderlings("Trötter")
        assertEquals(listOf("Skumtomten", "Dammråttan"), underlings)
    }
    }

