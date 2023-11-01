package com.github.thomastickle.leetcode.problem

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class Problem69Test {

    val problem = Problem69()

    @Test
    fun mySqrt() {
        assertEquals(2, problem.mySqrt(4))
        assertEquals(2, problem.mySqrt(8))
        assertEquals(1, problem.mySqrt(0))
    }
}