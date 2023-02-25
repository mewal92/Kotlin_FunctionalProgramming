package AoC_2018_01

import java.io.File

class AoC_Day1_2018(list: List<String>) {
    private val allFrequencies: List<Int> = list.map { it.toInt() }

    fun countAllFrequencies(): Int {
        return allFrequencies.sum()
    }

    fun firstFrequencyReachedTwice(): String {
        val frequencies = mutableSetOf(0)
        var currentFrequency = 0

        while (true) {
            for (i in allFrequencies) {
                currentFrequency += i

                if (frequencies.contains(currentFrequency)) {
                    return currentFrequency.toString()
                }

                frequencies.add(currentFrequency)
            }
        }
    }
}

fun main() {
    val list: List<String> = File("src/main/Kotlin/AoC_2018_01/Frequencies").readLines()
    println("Del 1: " + AoC_Day1_2018(list).countAllFrequencies())
    println("Del 2: " + AoC_Day1_2018(list).firstFrequencyReachedTwice())
}




