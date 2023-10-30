package com.github.thomastickle.leetcode.problem

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class Problem13Test {

    @Test
    fun romanToInt() {
        assertEquals(3, Problem13().romanToInt("III"))
        assertEquals(58, Problem13().romanToInt("LVIII"))
        assertEquals(1994, Problem13().romanToInt("MCMXCIV"))
    }
}