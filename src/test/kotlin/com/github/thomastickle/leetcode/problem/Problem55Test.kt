package com.github.thomastickle.leetcode.problem

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class Problem55Test {

    val problem55 = Problem55()

    @Test
    fun canJump() {
        assertTrue(problem55.canJump(intArrayOf(2,3,1,1,4)))
        assertFalse(problem55.canJump(intArrayOf(3,2,1,0,4)))
        assertFalse(problem55.canJump(intArrayOf(0,1)))
        assertTrue(problem55.canJump(intArrayOf(2,0)))
        assertFalse(problem55.canJump(intArrayOf(0,1)))
        assertTrue(problem55.canJump(intArrayOf(0)))
    }
}
