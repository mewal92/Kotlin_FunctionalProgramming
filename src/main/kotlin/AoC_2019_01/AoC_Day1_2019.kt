package AoC_2019_01

import java.io.File

class AoC_Day1_2019() {

    fun calculateFuel(fuel: Int): Int {
        return fuel / 3 - 2
    }

    fun fuelList(list: List<String>): Int {
        val intList = list.map { it.toInt() }
        val totalFuel = intList.map { calculateFuel(it) }
        return totalFuel.sum()
    }

    fun fuelWithFuel(mass: Int): Int {
        val fuel = calculateFuel(mass)
        return if (fuel <= 0) {
            0
        } else {
            fuel + fuelWithFuel(fuel)
        }
    }
}

fun main() {
    val list: List<String> = File("src/main/Kotlin/AoC_2019_01/Fuels").readLines()
    val aocDay1 = AoC_Day1_2019()
    println("Del 1: " + aocDay1.fuelList(list))
    println("Del 2: " + list.map { aocDay1.fuelWithFuel(it.toInt()) }.sum())
}



