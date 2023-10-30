package com.github.thomastickle.leetcode.problem

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class Problem20Test {

    @Test
    fun isValid() {
        assertTrue(Problem20().isValid("()"))
        assertTrue(Problem20().isValid("()[]{}"))
        assertFalse(Problem20().isValid("(]"))
        assertFalse(Problem20().isValid("["))
        assertFalse(Problem20().isValid("]"))
    }
}