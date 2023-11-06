package com.github.thomastickle.leetcode.problem

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class Problem3Test {

    val problem3 = Problem3()

    @Test
    fun lengthOfLongestSubstring() {
        assertEquals(0, problem3.lengthOfLongestSubstring(""))
        assertEquals(1, problem3.lengthOfLongestSubstring(" "))
        assertEquals(3, problem3.lengthOfLongestSubstring("abc"))
        assertEquals(2, problem3.lengthOfLongestSubstring("aab"))
        assertEquals(2, problem3.lengthOfLongestSubstring("abba"))
        assertEquals(3, problem3.lengthOfLongestSubstring("abcabcbb"))
        assertEquals(1, problem3.lengthOfLongestSubstring("bbbb"))
        assertEquals(3, problem3.lengthOfLongestSubstring("pwwkew"))

    }
}