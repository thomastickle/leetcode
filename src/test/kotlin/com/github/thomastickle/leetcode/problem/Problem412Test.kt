package com.github.thomastickle.leetcode.problem

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class Problem412Test {

    val problem = Problem412()

    @Test
    fun fizzBuzz() {
        assertEquals(listOf("1", "2", "Fizz"), problem.fizzBuzz(3))
    }
}
