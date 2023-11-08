package com.github.thomastickle.leetcode.problem

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class Problem8Test {

    val problem8 = Problem8()

    @Test
    fun myAtoi() {
        assertEquals(42, problem8.myAtoi("42"))
        assertEquals(-42, problem8.myAtoi("-42"))
        assertEquals(4193, problem8.myAtoi("4193 with words"))
        assertEquals(-2147483648, problem8.myAtoi("-91283472332"))
        assertEquals(2147483646, problem8.myAtoi("2147483646"))
        assertEquals(-2147483648, problem8.myAtoi("-6147483648"))
        assertEquals(2147483647, problem8.myAtoi("21474836460"))
    }
}
