package com.github.thomastickle.leetcode.problem

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class Problem12Test {

    val problem12 = Problem12()

    @Test
    fun intToRoman() {
        assertEquals("III", problem12.intToRoman(3))
        assertEquals("LVIII", problem12.intToRoman(58))
        assertEquals("MCMXCIV", problem12.intToRoman(1994))
    }
}
