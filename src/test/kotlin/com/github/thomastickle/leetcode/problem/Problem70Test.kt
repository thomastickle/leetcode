package com.github.thomastickle.leetcode.problem

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class Problem70Test {

    val problem = Problem70()

    @Test
    fun climbStairs() {
        assertEquals(2, problem.climbStairs(2))
        assertEquals(3, problem.climbStairs(3))
        assertEquals(5, problem.climbStairs(4))
    }
}