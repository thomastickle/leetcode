package com.github.thomastickle.leetcode.problem

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class Problem274Test {

    val problem274 = Problem274()

    @Test
    fun hIndex() {
        assertEquals(3, problem274.hIndex(intArrayOf(3,0,6,1,5)))
        assertEquals(1, problem274.hIndex(intArrayOf(1,3,1)))
        assertEquals(3, problem274.hIndex(intArrayOf(3, 0, 6, 1, 5)))
    }
}
