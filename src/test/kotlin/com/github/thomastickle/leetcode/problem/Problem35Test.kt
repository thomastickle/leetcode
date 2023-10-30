package com.github.thomastickle.leetcode.problem

import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

class Problem35Test {

    val problem = Problem35()

    @Test
    fun searchInsert() {
        val index = problem.searchInsert(intArrayOf(1,3,5,6), 5)
        assertEquals(2, index)

        val index1 = problem.searchInsert(intArrayOf(1,3,5,6), 2)
        assertEquals(1, index1)

        val index2 = problem.searchInsert(intArrayOf(1,3,5,6), 7)
        assertEquals(4, index2)
    }
}