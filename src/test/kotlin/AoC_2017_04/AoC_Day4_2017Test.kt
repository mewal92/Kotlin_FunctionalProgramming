package AoC_2017_04

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class AoC_Day4_2017Test {

    val day4 = AoC_Day4_2017()

        @Test
        fun countValidPassPhrasesPartOneTest() {
            val input = listOf("aa bb cc dd ee", "aa bb cc dd aa", "aa bb cc dd aaa")
            val validPhrases = 2
            assertEquals(validPhrases, day4.countValidPassPhrasesPartOne(input))
        }

        @Test
        fun anagramTesterTrue() {
            val word1 = "iioi iiio"
            val word2 = "oiii ioii"
            assertEquals(true, day4.isAnagram(word1, word2))
        }

        @Test
        fun anagramTesterFalse() {
            val word1 = "abcde"
            val word2 = " fghij"
            assertEquals(false, day4.isAnagram(word1, word2))
        }

        @Test
        fun countValidPassPhrasesByAnagramTest() {
            val input = listOf("abcde fghij", "abcde xyz ecdab", "a ab abc abd abf abj", "iiii oiii ooii oooi oooo")
            val expected = 3
            assertEquals(expected, day4.countValidPassPhrasesByAnagram(input))
        }
    }
