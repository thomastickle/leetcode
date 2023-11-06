package com.github.thomastickle.leetcode.problem

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class Problem22Test {

    val problem22 = Problem22()

    @Test
    fun generateParenthesis() {
        assertEquals(listOf("()"), problem22.generateParenthesis(1))
        assertEquals(listOf("()()", "(())"), problem22.generateParenthesis(2))
    }
}