package com.github.thomastickle.leetcode.problem

import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

class Problem383Test {
    val problem383 = Problem383()

    @Test
    fun canConstruct() {
        assertFalse(problem383.canConstruct("a", "b"))
        assertFalse(problem383.canConstruct("aa", "ab"))
        assertTrue(problem383.canConstruct("aa", "aab"))
    }

}
