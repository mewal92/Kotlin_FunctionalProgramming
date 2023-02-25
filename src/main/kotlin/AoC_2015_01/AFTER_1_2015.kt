package AoC_2015_01

import java.io.File

//Efterlösningen är inspirerad av en blanding av
//https://github.com/0legg/adventofcode/blob/master/year2015/src/main/kotlin/net/olegg/aoc/year2015/day1/Day1.kt
//samt
//https://github.com/edgars-supe/advent-of-code/blob/master/src/main/kotlin/lv/esupe/aoc/year2015/Day1.kt

class AFTER_1_2015 {

    fun countFloors(list: List<String>): Int {
        val input = list[0]
            .map { c ->
                when (c) {
                    '(' -> 1
                    ')' -> -1
                   else -> 0
                }
            }
        return input.sum()
    }

    fun findIndexOfBasement(list: List<String>): Int {
        return list.runningReduce {
                acc, value -> acc + value }.indexOfFirst { it < 0.toString() } + 1
    }
}


fun main(){
    val list: List<String> = File("src/main/Kotlin/AoC_2015_01/Floors").readLines()
    println("Del 1: " + AoC_Day1_2015().countFloors(list))
    println("Del 2: " + AoC_Day1_2015().findIndexOfBasement(list))
}