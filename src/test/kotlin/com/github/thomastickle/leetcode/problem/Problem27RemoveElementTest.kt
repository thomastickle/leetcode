package com.github.thomastickle.leetcode.problem

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class Problem27RemoveElementTest {

    val problem = Problem27RemoveElement()

    @Test
    fun removeElement() {
        val intArray = intArrayOf(3, 2, 2, 3)
        val result = problem.removeElement(intArray, 3)
        assertEquals(2, result);
        assertEquals(2, intArray[0] )
        assertEquals(2, intArray[1])
    }
}