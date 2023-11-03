package com.github.thomastickle.leetcode.problem

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class Problem121Test {

    private val problem121 = Problem121()

    @Test
    fun maxProfit() {
        assertEquals(5, problem121.maxProfit(intArrayOf(7,1,5,3,6,4)))
        assertEquals(0, problem121.maxProfit(intArrayOf(7, 6, 4, 3, 1)))
    }
}
