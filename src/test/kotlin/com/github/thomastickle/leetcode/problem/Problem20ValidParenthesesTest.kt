package com.github.thomastickle.leetcode.problem

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class Problem20ValidParenthesesTest {

    @Test
    fun isValid() {
        assertTrue(Problem20ValidParentheses().isValid("()"))
        assertTrue(Problem20ValidParentheses().isValid("()[]{}"))
        assertFalse(Problem20ValidParentheses().isValid("(]"))
        assertFalse(Problem20ValidParentheses().isValid("["))
        assertFalse(Problem20ValidParentheses().isValid("]"))
    }
}