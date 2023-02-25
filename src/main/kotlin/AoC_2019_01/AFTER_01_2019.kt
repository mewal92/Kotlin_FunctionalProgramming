package AoC_2019_01

import java.io.File


// I efterkoden har jag inte utgått ifrån någon specifik lösning, men jag har försökt lösa
//uppgiften med hjälp utav lambdas istället för hur jag gjorde innan!
class AFTER_01_2019() {

    val calculateFuel: (Int) -> Int = { mass -> mass / 3 - 2 }

    val fuelList: (List<String>) -> Int = { list ->
        list.map { it.toInt() }
            .map(calculateFuel)
            .sum()
    }

    val fuelWithFuel: (Int) -> Int = { mass ->
        generateSequence(mass, { calculateFuel(it).takeIf { fuel -> fuel > 0 } })
            .map { it - 2 }
            .sum()
    }

}

fun main() {
    val list: List<String> = File("src/main/Kotlin/AoC_2019_01/Fuels").readLines()
    val aocDay1 = AoC_Day1_2019()
    println("Del 1: " + aocDay1.fuelList(list))
    println("Del 2: " + list.sumBy { aocDay1.fuelWithFuel(it.toInt()) })
}
