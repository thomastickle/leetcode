package com.github.thomastickle.leetcode.problem

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class Problem125Test {

    val problem125 = Problem125()

    @Test
    fun isPalindrome() {
        assertTrue(problem125.isPalindrome("amanaplanacanalpanama"))
        assertFalse(problem125.isPalindrome("race a car"))
        assertTrue(problem125.isPalindrome(""))
    }
}
