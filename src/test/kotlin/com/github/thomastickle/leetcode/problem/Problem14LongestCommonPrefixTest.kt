package com.github.thomastickle.leetcode.problem

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class Problem14LongestCommonPrefixTest {

    @Test
    fun longestCommonPrefix() {
        assertEquals("fl", Problem14LongestCommonPrefix().longestCommonPrefix(arrayOf("flower", "flow", "flight")))
        assertEquals("", Problem14LongestCommonPrefix().longestCommonPrefix(arrayOf("dog", "racecar", "car")))
        assertEquals("a", Problem14LongestCommonPrefix().longestCommonPrefix(arrayOf("a")))
        assertEquals("a", Problem14LongestCommonPrefix().longestCommonPrefix(arrayOf("ab", "a")))
        assertEquals("flower", Problem14LongestCommonPrefix().longestCommonPrefix(arrayOf("flower","flower","flower","flower")))
    }
}