package com.github.thomastickle.leetcode.problem

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class Problem14Test {

    @Test
    fun longestCommonPrefix() {
        assertEquals("fl", Problem14().longestCommonPrefix(arrayOf("flower", "flow", "flight")))
        assertEquals("", Problem14().longestCommonPrefix(arrayOf("dog", "racecar", "car")))
        assertEquals("a", Problem14().longestCommonPrefix(arrayOf("a")))
        assertEquals("a", Problem14().longestCommonPrefix(arrayOf("ab", "a")))
        assertEquals("flower", Problem14().longestCommonPrefix(arrayOf("flower","flower","flower","flower")))
    }
}