package com.github.thomastickle.leetcode.problem

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class Problem209Test {

    val problem209 = Problem209()

    @Test
    fun minSubArrayLen() {
        assertEquals(2, problem209.minSubArrayLen(7, intArrayOf(2,3,1,2,4,3)))
        assertEquals(1, problem209.minSubArrayLen(1, intArrayOf(1,4,4)))
        assertEquals(0, problem209.minSubArrayLen(11, intArrayOf(1,1,1,1,1,1,1,1)))
        assertEquals(5, problem209.minSubArrayLen(15, intArrayOf(1,2,3,4,5)))
        assertEquals(8, problem209.minSubArrayLen(213, intArrayOf(12,28,83,4,25,26,25,2,25,25,25,12)))
    }
}
