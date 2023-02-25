package AoC_2015_01

import java.io.File

class AoC_Day1_2015() {

    fun countFloors(list: List<String>): Int {
        val floorArray = list.joinToString("").toCharArray()
        var floorcounter = 0

        for (floors in floorArray)
            when (floors) {
                '(' -> floorcounter += 1
                ')' -> floorcounter += -1
            }
        return floorcounter
    }

    fun findIndexOfBasement(list: List<String>): Int {
        val floorArray = list.joinToString("").toCharArray()
        var sum = 0
        for ((index, floor) in floorArray.withIndex()) {
            when (floor) {
                '(' -> sum += 1
                ')' -> sum -= 1
            }
            if (sum == -1) {
                return index + 1
            }
        }
        return 0
    }
}
fun main(){
    val list: List<String> = File("src/main/Kotlin/AoC_2015_01/Floors").readLines()
    println("Del 1: " + AoC_Day1_2015().countFloors(list))
    println("Del 2: " + AoC_Day1_2015().findIndexOfBasement(list))
}
