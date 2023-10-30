package com.github.thomastickle.leetcode.problem

import java.util.*

class Problem20 {

    private fun isPair(firstChar: Char, secondChar: Char): Boolean {
        return when(firstChar) {
            '(' -> secondChar == ')'
            '{' -> secondChar == '}'
            '[' -> secondChar == ']'
            else -> false
        }
    }

    fun isValid(s: String): Boolean {
        val stack = Stack<Char>()

        for (i in s.indices) {
            when(s[i]) {
                '(','{', '[' -> stack.push(s[i])
                else -> {
                    if (stack.isEmpty()) {
                        return false
                    }
                    if (!isPair(stack.peek(), s[i])) {
                        return false
                    }
                    stack.pop()
                }
            }
        }
        return stack.isEmpty()
    }
}