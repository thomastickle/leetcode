package com.github.thomastickle.leetcode.problem

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class Problem28Test {

    val problem = Problem28()

    @Test
    fun strStr() {
        val index = problem.strStr("sadbutsad", "sad")
        assertEquals(0, index)

        val index2 = problem.strStr("leetcode", "leeto")
        assertEquals(-1, 0)
    }
}