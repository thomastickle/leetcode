package com.github.thomastickle.leetcode.problem

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class Problem238Test {

    val problem238 = Problem238()

    @Test
    fun productExceptSelf() {

        val result1 = problem238.productExceptSelf(intArrayOf(1,2,3,4))
        assertArrayEquals(intArrayOf(24,12,8,6), result1);


        val result2 = problem238.productExceptSelf(intArrayOf(-1, 1, 0, -3, 3))
        assertArrayEquals(intArrayOf(0, 0, 9, 0, 0), result2)
    }
}
