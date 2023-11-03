package com.github.thomastickle.leetcode.problem


class Problem125 {
    fun isPalindrome(s: String): Boolean {
        val cleanedString = s.lowercase().filter { it.isLetter() || it.isDigit()}
        val reversedString = cleanedString.reversed()
        return cleanedString == reversedString
    }
}
