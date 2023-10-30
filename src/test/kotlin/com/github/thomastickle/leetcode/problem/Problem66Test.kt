package com.github.thomastickle.leetcode.problem

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class Problem66Test {

    val problem = Problem66()

    @Test
    fun plusOne() {
        assertArrayEquals(intArrayOf(1,2,4), problem.plusOne(intArrayOf(1,2,3)))
        assertArrayEquals(intArrayOf(4,3,2,2), problem.plusOne(intArrayOf(4,3,2,1)))
        assertArrayEquals(intArrayOf(1,0), problem.plusOne(intArrayOf(9)))
    }
}