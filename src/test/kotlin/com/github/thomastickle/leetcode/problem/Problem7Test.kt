package com.github.thomastickle.leetcode.problem

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class Problem7Test {

    val problem7 = Problem7()

    @Test
    fun reverse() {
        assertEquals(321, problem7.reverse(123))
        assertEquals(-321, problem7.reverse(-123))
        assertEquals(21, problem7.reverse(120))
        assertEquals(0, problem7.reverse(1534236469))
    }
}