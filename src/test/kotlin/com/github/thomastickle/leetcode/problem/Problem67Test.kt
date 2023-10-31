package com.github.thomastickle.leetcode.problem

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class Problem67Test {

    val problem = Problem67()

    @Test
    fun addBinary() {
        assertEquals("0", problem.addBinary("0","0"))
        assertEquals("1", problem.addBinary("1","0"))
        assertEquals("1", problem.addBinary("0", "1"))
        assertEquals("10", problem.addBinary("1", "1"))

        assertEquals("11", problem.addBinary("11", "00"))
        assertEquals("100", problem.addBinary("11", "01"))
        assertEquals("101", problem.addBinary("11", "10"))
        assertEquals("110", problem.addBinary("11", "11"))


        assertEquals("100", problem.addBinary("11", "1"))
        assertEquals("10101", problem.addBinary("1010", "1011"))
        assertEquals("0", problem.addBinary("0", "0"))
        assertEquals("1000", problem.addBinary("1", "111"))
        assertEquals("11110", problem.addBinary("1111", "1111"))
        assertEquals("1001001", problem.addBinary("110010", "10111"))
    }
}