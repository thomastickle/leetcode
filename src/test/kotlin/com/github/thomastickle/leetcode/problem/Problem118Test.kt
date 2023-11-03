package com.github.thomastickle.leetcode.problem

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class Problem118Test {

    val problem = Problem118()

    @Test
    fun generate() {
        val generate = problem.generate(1)
        assertEquals(listOf(1), generate[0])
        val generate2 = problem.generate(2)
        assertEquals(listOf(1), generate2[0])
        assertEquals(listOf(1,1), generate2[1])
        val generate3 = problem.generate(3)
        assertEquals(listOf(1), generate3[0])
        assertEquals(listOf(1,1), generate3[1])
        assertEquals(listOf(1,2,1), generate3[2])
    }
}
