package com.github.thomastickle.leetcode.problem

class Problem132 {
    fun isSubsequence(s: String, t: String): Boolean {
        var i = 0
        var j = 0

        while (i < s.length && j < t.length) {
            if (s[i] == t[j]) {
                i++
            }

            j++
        }

        return i == s.length
    }
}
