package AoC_2018_02

import java.io.File

class AFTER_02_2018 {

    //Del 1: den här lösningen har inspirerats av användaren nutrecht på reddit
// inspirerad av: threefingers
    fun duplicateCount(list: List<String>) {
        val mapOfList = list.map { it ->
            it.toCharArray().asSequence()
                .groupBy { it }
                .map { it.key to it.value.size }
                .toMap()
        }

        val getDubbleChars = mapOfList.count { it -> it.entries.any { it.value == 2 } }
        val getTripleChars = mapOfList.count { it -> it.entries.any { it.value == 3 } }

        val idSum = getDubbleChars * getTripleChars
        println(idSum)
    }

    fun getCorrectBoxIDS(list: List<String>): String {
        var differentLetters = 0
        var sameLetter = ""
        list.forEach { str ->
            list.forEach { word ->
                if (!str.equals(word)) {
                    var diffs = 0
                    var same = ""
                    for (i in 0 until str.length) {
                        if (str[i] == word[i]) {
                            diffs++
                            same += word[i]
                        }
                    }

                    if (diffs > differentLetters) {
                        differentLetters = diffs
                        sameLetter = same
                    }
                }
            }
        }
        return sameLetter
    }
}
fun main(){
    val list: List<String> = File("src/main/Kotlin/AoC_2018_02/BoxID").readLines()
    println("Del 1: " + AFTER_02_2018().duplicateCount(list))
  println("Del 2: " + AFTER_02_2018().getCorrectBoxIDS(list))
}
