package com.github.thomastickle.leetcode.problem


import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

class Problem9Test {

    @Test
    fun isPalindrome() {
        assertTrue(Problem9().PalidromeNumber(121))
        assertFalse(Problem9().PalidromeNumber(-121))
        assertFalse(Problem9().PalidromeNumber(10))
        assertTrue(Problem9().PalidromeNumber(11))
    }
}