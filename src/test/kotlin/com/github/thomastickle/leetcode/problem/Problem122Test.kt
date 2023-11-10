package com.github.thomastickle.leetcode.problem

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class Problem122Test {

    val problem122 = Problem122()

    @Test
    fun maxProfit() {
        assertEquals(7, problem122.maxProfit(intArrayOf(7,1,5,3,6,4)))
        assertEquals(4, problem122.maxProfit(intArrayOf(1,2,3,4,5)))
        assertEquals(0, problem122.maxProfit(intArrayOf(7,5,3,2,1)))
    }
}
