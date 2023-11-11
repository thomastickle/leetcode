package com.github.thomastickle.leetcode.problem

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class Problem45Test {

    val problem = Problem45()

    @Test
    fun jump() {
        assertEquals(0, problem.jump(intArrayOf(0)))
        assertEquals(0, problem.jump(intArrayOf(1)))
        assertEquals(1, problem.jump(intArrayOf(1,0)))
        assertEquals(1, problem.jump(intArrayOf(2,2,0)))
        assertEquals(2, problem.jump(intArrayOf(2,3,1,1,4)))
        assertEquals(2, problem.jump(intArrayOf(2,3,0,1,4)))
    }
}
