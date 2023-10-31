package com.github.thomastickle.leetcode.problem

class Problem58 {
    fun lengthOfLastWord(s: String): Int {
        var length = 0
        var index = s.length - 1
        while (index >= 0 && s[index] == ' ') {
            index--
        }

        while (index >= 0 && s[index] != ' ') {
            length++
            index--
        }
        return length
    }
}