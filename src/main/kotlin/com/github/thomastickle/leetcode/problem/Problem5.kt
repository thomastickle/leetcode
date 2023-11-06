package com.github.thomastickle.leetcode.problem

class Problem5 {
    fun longestPalindrome(s: String): String {
        var left = 0
        var right = 0

        fun expandUntilNotPalindrome(start: Int, end: Int) {
            var i = start
            var j = end

            while (i >= 0 && j < s.length && s[i] == s[j]) {
                i--
                j++
            }

            if (j-i > right - left) {
                right = j
                left = i + 1
            }
        }


        for (i in s.indices) {
            if (i != 0) expandUntilNotPalindrome(i - 1, i)
            expandUntilNotPalindrome(i, i)
        }

        return s.substring(left, right)
    }
}