package com.github.thomastickle.leetcode.problem

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class Problem88Test {
    val problem = Problem88()

    @Test
    fun testMerge() {
        val array1 = intArrayOf(1,2,3,0,0,0)
        val array2 = intArrayOf(2, 5, 6)
        problem.merge(array1, 3, array2, 3)
        assertArrayEquals(intArrayOf(1,2,2,3,5,6), array1)
    }
}