package com.github.thomastickle.leetcode.problem

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class Problem58Test {

    val problem = Problem58()

    @Test
    fun lengthOfLastWord() {
        val length = problem.lengthOfLastWord("Hello World")
        assertEquals(5, length)

        val length2 = problem.lengthOfLastWord("   fly me   to   the moon  ");
        assertEquals(4, length2)

        val length3 = problem.lengthOfLastWord("luffy is still joyboy")
        assertEquals(6, length3)
    }
}