package com.github.thomastickle.leetcode.problem

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class Problem11Test {

    val problem11 = Problem11()


    @Test
    fun maxArea() {
        assertEquals(1, problem11.maxArea(intArrayOf(1,1)))
        assertEquals(49, problem11.maxArea(intArrayOf(1, 8, 6, 2, 5, 4, 8, 3, 7)))
    }
}