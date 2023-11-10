package com.github.thomastickle.leetcode.problem

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class Problem190Test {

    val problem190 = Problem190()

    @Test
    fun reverseBits() {
        assertEquals(-1073741825, problem190.reverseBits(-3))
        assertEquals(964176192, problem190.reverseBits(43261596))

    }
}
