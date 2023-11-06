package com.github.thomastickle.leetcode.problem

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Problem2Test {

    val problem2 = Problem2()

    @Test
    fun addTwoNumbers() {
        val first = constructListFromValues(2,4,3)
        val second = constructListFromValues(5,6,4)
        val result = problem2.addTwoNumbers(first, second)
        assertEquals(7, result?.`val`)
        assertEquals(0, result?.next?.`val`)
        assertEquals(8, result?.next?.next?.`val`)
    }
}