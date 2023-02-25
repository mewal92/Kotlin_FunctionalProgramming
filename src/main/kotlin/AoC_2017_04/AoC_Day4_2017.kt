package AoC_2017_04
import java.io.File

class AoC_Day4_2017() {

    /*funktionen läser in listan som strängar
    en counter skapas för att räkna unika ord
    Sedan kollar jag om antalet unika ord i listan är
    lika med antal ord i listan, så att inga ord upprepas och
    till slut returnerar den antalet unika giltiga ord*/

    fun countValidPassPhrasesPartOne(list: List<String>): Int {
        val rows = list.map { it.split(" ") }
        var count = 0
        for (row in rows) {
            if (row.size == row.toSet().size) {
                count++
            }
        }
        return count
    }




     /*Kör först en boolean som tar in två strängar och
     jämför ifall orden är lika ifall man flyttar runt bokstäverna
     i en annan ordning, om dom är likadana returneras true*/

    fun isAnagram(word1: String, word2: String): Boolean {
        return word1.length == word2.length && word1.toCharArray().sorted() == word2.toCharArray().sorted()
    }




    /*Nästa boolean tar emot en lista med ord och returnerar
    true om det finns ett giltigt ord, så listan loopar igenom
    och jämför orden med hjälp av min första boolean, om två
    är lika blir det false annars true*/

    fun isValidPassphrase2(words: List<String>): Boolean {
        for (i in words.indices) {
            for (j in i + 1 until words.size) {
                if (isAnagram(words[i], words[j])) {
                    return false
                }
            }
        }
        return true
    }



    /*Funktionen till del två använder då båda booleans för att
    loopa igenom orden och hitta antalet giltiga ord som
    då returneras*/

    fun countValidPassPhrasesByAnagram(list: List<String>) : Int {
        val rows = list.map { it.split(" ") }
        var validCount2 = 0

        for (words in rows) {
            if (isValidPassphrase2(words)) {
                validCount2++
            }
        }
        return validCount2
    }
}

        fun main() {
    val list: List<String> = File("src/main/Kotlin/AoC_2017_04/Passphrases").readLines()
    println("Del 1: " + AoC_Day4_2017().countValidPassPhrasesPartOne(list))
   println("Del 2: " + AoC_Day4_2017().countValidPassPhrasesByAnagram(list))
}