package com.github.thomastickle.leetcode.problem

class Problem22 {
    fun generateParenthesis(n: Int): List<String> {
        var result = mutableListOf<String>()

        if (n == 1) {
            result += "()"
        }



        return result
    }
}