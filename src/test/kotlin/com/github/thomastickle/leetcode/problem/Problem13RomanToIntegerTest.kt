package com.github.thomastickle.leetcode.problem

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class Problem13RomanToIntegerTest {

    @Test
    fun romanToInt() {
        assertEquals(3, Problem13RomanToInteger().romanToInt("III"))
        assertEquals(58, Problem13RomanToInteger().romanToInt("LVIII"))
        assertEquals(1994, Problem13RomanToInteger().romanToInt("MCMXCIV"))
    }
}