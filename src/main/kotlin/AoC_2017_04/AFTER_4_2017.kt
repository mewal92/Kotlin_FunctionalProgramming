package AoC_2017_04

import java.io.File
class AFTER_4_2017 () {

/* Blev inspirerad av användaren "tginsberg" på Github som hade gjort den här lösningen utan
booleans och med mycket kortade kod. Så jag gjorde egna nya funktioner där jag använde
mig utav lambdas istället och jämförde orden genom att kolla om listornas size/distinct size stämde
när den var osorterad/sorterad
 */

     fun countValidPassPhrasesPartOne(list: List<String>): Int =
         list.count { phrase ->
             val words = phrase.split(' ')
             words.distinct().size == words.size
         }


     fun countValidPassPhrasesByAnagram(list: List<String>): Int =
         list.count { phrase ->
             val words = phrase.split(' ')
             val sortedWords = words.map { it.toList().sorted() }
             sortedWords.distinct().size == sortedWords.size
         }
 }


    fun main() {
        val list: List<String> = File("src/main/Kotlin/AoC_2017_04/Passphrases").readLines()
        println("Del 1: " + AFTER_4_2017().countValidPassPhrasesPartOne(list))
        println("Del 2: " + AFTER_4_2017().countValidPassPhrasesByAnagram(list))
    }
