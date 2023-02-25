package AoC_2018_01

import java.io.File

class AFTER_1_2018() {

    // denna "efter" lösning gjorde jag själv endast genom att snygga till min gamla lösning
    //med lite förbättrad kod som jag inspirerats av olika personer på reddit

    fun countAllFrequencies(list: List<String>): Int {
        return list.sumOf { it.toInt() }
    }

    fun firstFrequencyReachedTwice() : String {
        val frequencies = mutableSetOf(0)
        var currentFrequency = 0

        while (true)
            for (i in frequencies) {
                currentFrequency += i

                if (currentFrequency in frequencies) {
                    return currentFrequency.toString()
                }

                frequencies += currentFrequency
            }
    }
}
fun main() {
    val list: List<String> = File("src/main/Kotlin/AoC_2018_01/Frequencies").readLines()
    println("Del 1: " + AFTER_1_2018().countAllFrequencies(list))
    println("Del 2: " + AFTER_1_2018().firstFrequencyReachedTwice())
}

