package com.github.thomastickle.leetcode.problem


import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

class Problem9IsPalindromeTest {

    @Test
    fun isPalindrome() {
        assertTrue(Problem9IsPalindrome().PalidromeNumber(121))
        assertFalse(Problem9IsPalindrome().PalidromeNumber(-121))
        assertFalse(Problem9IsPalindrome().PalidromeNumber(10))
        assertTrue(Problem9IsPalindrome().PalidromeNumber(11))
    }
}