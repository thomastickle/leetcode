package com.github.thomastickle.leetcode.problem

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class Problem67Test {

    val problem = Problem67()

    @Test
    fun addBinary() {
        assertEquals("100", problem.addBinary("11", "1"))
        assertEquals("1010a", problem.addBinary("1010", "1011"))
    }
}