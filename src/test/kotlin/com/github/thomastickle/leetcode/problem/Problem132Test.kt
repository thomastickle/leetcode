package com.github.thomastickle.leetcode.problem

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class Problem132Test {

    val problem132 = Problem132()

    @Test
    fun isSubsequence() {
        assertTrue(problem132.isSubsequence("abc", "ahbgdc"))
        assertFalse(problem132.isSubsequence("axc", "ahbgdc"))
    }
}
