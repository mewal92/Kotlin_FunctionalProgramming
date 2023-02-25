package AoC_2018_02
import java.io.File

class AoC_Day2_2018 () {

    fun duplicateCount(list: List<String>) : Int {
        val countCharsList = mutableListOf<Map<Char, Int>>()

        for (str in list) {
            val countCharsToMap = mutableMapOf<Char, Int>()
            for (char in str) {
                countCharsToMap[char] = countCharsToMap.getOrDefault(char, 0) + 1
            }
            countCharsList.add(countCharsToMap)
        }

        var doubleLetter = 0
        var tripleLetter = 0
        for (countCharsToMap in countCharsList) {
            if (countCharsToMap.any { it.value == 2 }) {
                doubleLetter++
            }
            if (countCharsToMap.any { it.value == 3 }) {
                tripleLetter++
            }
        }

        val idSum = doubleLetter * tripleLetter
       return idSum
    }

    fun getCorrectBoxIDS(list: List<String>): String {
        var differentLetters = 0
        var sameLetter = ""

        for (i in 0 until list.size) {
            for (j in i + 1 until list.size) {
                val str = list[i]
                val word = list[j]
                var diffs = 0
                var same = ""

                for (k in 0 until str.length) {
                    if (str[k] == word[k]) {
                        diffs++
                        same += str[k]
                    }
                }

                if (diffs > differentLetters) {
                    differentLetters = diffs
                    sameLetter = same
                }
            }
        }

        return sameLetter
    }
}

fun main(){
        val list: List<String> = File("src/main/Kotlin/AoC_2018_02/BoxID").readLines()
    println("Del 1: " + AoC_Day2_2018().duplicateCount(list))
    println("Del 2: " + AoC_Day2_2018().getCorrectBoxIDS(list))
}
