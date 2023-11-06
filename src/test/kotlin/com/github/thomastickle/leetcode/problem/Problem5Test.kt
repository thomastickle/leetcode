package com.github.thomastickle.leetcode.problem

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class Problem5Test {

    val problem5 = Problem5()

    @Test
    fun longestPalindrome() {
        assertEquals("a", problem5.longestPalindrome("a"))
        assertEquals("bb", problem5.longestPalindrome("bb"))
        assertEquals("bb", problem5.longestPalindrome("cbbd"))
        assertEquals("aba", problem5.longestPalindrome("babad"))
    }
}