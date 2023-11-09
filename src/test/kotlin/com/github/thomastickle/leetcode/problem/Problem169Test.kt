package com.github.thomastickle.leetcode.problem

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class Problem169Test {

    val problem169 = Problem169()

    @Test
    fun majorityElement() {
        assertEquals(3, problem169.majorityElement(intArrayOf(3,2,3)))
        assertEquals(2, problem169.majorityElement(intArrayOf(2,2,1,1,1,2,2)))
    }
}
