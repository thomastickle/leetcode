package com.github.thomastickle.leetcode.problem

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class Problem26Test {

    val problem = Problem26()

    @Test
    fun testRemoveDuplicates() {
        val nums = intArrayOf(1,1,2)
        val value = problem.removeDuplicates(nums);
        assertEquals(2, value)
        var array = IntArray(3)
        array[0] = 1
        array[1] = 2
        array[2] = 2
        assertArrayEquals(array, nums)
    }

}