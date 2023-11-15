package com.github.thomastickle.leetcode.problem

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class Problem134Test {

    val problem134 = Problem134()

    @Test
    fun canCompleteCircuit() {
        assertEquals(-1, problem134.canCompleteCircuit(intArrayOf(2, 3, 4), intArrayOf(3, 4, 3)))
        assertEquals(3, problem134.canCompleteCircuit(intArrayOf(1, 2, 3, 4, 5), intArrayOf(3, 4, 5, 1, 2)))
    }
}
