package com.github.thomastickle.leetcode.problem

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class Problem151Test {

    val problem151 = Problem151()

    @Test
    fun reverseWords() {
        assertEquals("blue is sky the", problem151.reverseWords("the sky is blue"))
        assertEquals("world hello", problem151.reverseWords("  hello world  "))
        assertEquals("example good a", problem151.reverseWords("a good   example"))
    }
}
