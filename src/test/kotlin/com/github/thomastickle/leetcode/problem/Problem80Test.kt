package com.github.thomastickle.leetcode.problem

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class Problem80Test {

    val problem80 = Problem80()

    @Test
    fun removeDuplicates() {
        val testArray = intArrayOf(1)
        assertEquals(1, problem80.removeDuplicates(testArray))
        val testArray2 = intArrayOf(1,1,1,2,2,3)
        assertEquals(5, problem80.removeDuplicates(testArray2))
        assertEquals(listOf(1,1,2,2,3), testArray2.slice(IntRange(0,4)))
    }
}
