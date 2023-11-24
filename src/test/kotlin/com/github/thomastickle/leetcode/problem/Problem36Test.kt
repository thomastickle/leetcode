package com.github.thomastickle.leetcode.problem

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class Problem36Test {

    val problem36 = Problem36()

    fun convertString(string: String): Array<CharArray> {
        var result = emptyList<CharArray>()
        var currentList = CharArray(9)
        var index = 0
        for (i in string.indices) {
            if (string[i].isDigit() || string[i] == '.') {
                currentList[index++] = string[i]
            }

            if (string[i] == '[') {
                currentList = CharArray(9)
            }

            if (string[i] == ']' && index > 0) {
                result = result + currentList
                index = 0
            }

        }
        return result.toTypedArray()
    }


    @Test
    fun isValidSudoku() {
        val line = "[[\"5\",\"3\",\".\",\".\",\"7\",\".\",\".\",\".\",\".\"]\n" +
                ",[\"6\",\".\",\".\",\"1\",\"9\",\"5\",\".\",\".\",\".\"]\n" +
                ",[\".\",\"9\",\"8\",\".\",\".\",\".\",\".\",\"6\",\".\"]\n" +
                ",[\"8\",\".\",\".\",\".\",\"6\",\".\",\".\",\".\",\"3\"]\n" +
                ",[\"4\",\".\",\".\",\"8\",\".\",\"3\",\".\",\".\",\"1\"]\n" +
                ",[\"7\",\".\",\".\",\".\",\"2\",\".\",\".\",\".\",\"6\"]\n" +
                ",[\".\",\"6\",\".\",\".\",\".\",\".\",\"2\",\"8\",\".\"]\n" +
                ",[\".\",\".\",\".\",\"4\",\"1\",\"9\",\".\",\".\",\"5\"]\n" +
                ",[\".\",\".\",\".\",\".\",\"8\",\".\",\".\",\"7\",\"9\"]]"
        assertTrue(problem36.isValidSudoku(convertString(line)))
    }
}
