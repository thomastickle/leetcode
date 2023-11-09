package com.github.thomastickle.leetcode.problem

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class Problem189Test {

    val problem189 = Problem189()

    @Test
    fun rotate() {
        val test1 = intArrayOf(1,2,3,4,5,6,7)
        problem189.rotate(test1, 3)
        assertEquals(listOf(5,6,7,1,2,3,4), test1.toList())
    }
}
