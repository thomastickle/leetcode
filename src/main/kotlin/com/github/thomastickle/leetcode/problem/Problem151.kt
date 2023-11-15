package com.github.thomastickle.leetcode.problem

class Problem151 {
    fun reverseWords(s: String): String {
        return s.split(" ").filter(String::isNotEmpty).reversed().joinToString(" ")
    }
}
