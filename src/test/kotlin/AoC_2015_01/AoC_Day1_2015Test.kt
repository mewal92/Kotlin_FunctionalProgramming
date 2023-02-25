package AoC_2015_01

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class AoC_Day1_2015Test() {

    var floor = AoC_Day1_2015()
    @Test
    fun countFloorsTest() {
        val floortest1 = listOf("()()")
        val validfloortest1 = 0
        val floortest2 = listOf("(()(()(")
        val validfloortest2 = 3
       val floortest3 =  listOf(")())())")
        val validfloortest3 = -3
        assertEquals(validfloortest1, floor.countFloors(floortest1))
        assertEquals(validfloortest2, floor.countFloors(floortest2))
        assertEquals(validfloortest3, floor.countFloors(floortest3))
    }

    @Test
    fun findIndexOfBasementTest() {
       val indexfloor1 = listOf(")")
        val correctindex1 = 1
        val indexfloor2 = listOf("()())")
        val correctindex2 = 5
        assertEquals(correctindex1, floor.findIndexOfBasement(indexfloor1))
        assertEquals(correctindex2, floor.findIndexOfBasement(indexfloor2))
    }
}