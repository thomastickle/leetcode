package com.github.thomastickle.leetcode.problem

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class Problem167Test {

    val problem167 = Problem167()

    @Test
    fun twoSum() {
        assertArrayEquals(intArrayOf(1,2), problem167.twoSum(intArrayOf(2,7,11,15), 9))
        assertArrayEquals(intArrayOf(1,3), problem167.twoSum(intArrayOf(2,3,4), 6))
        assertArrayEquals(intArrayOf(1,2), problem167.twoSum(intArrayOf(-1, 0), target = -1))
    }
}
