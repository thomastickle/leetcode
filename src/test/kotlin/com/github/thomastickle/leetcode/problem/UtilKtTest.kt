package com.github.thomastickle.leetcode.problem

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class UtilKtTest {

    @Test
    fun constructTreeFromValues() {
        assertNull(constructTreeFromValues(emptyList()))
        val result = constructTreeFromValues(listOf(1))
        assertEquals(1, result?.`val`)

        val result1 = constructTreeFromValues(listOf(5,4,8))
        assertEquals(5, result1?.`val`)
        assertEquals(4, result1?.left?.`val`)
        assertEquals(8, result1?.right?.`val`)

        val result2= constructTreeFromValues(listOf(5,4,8,11,null,13,4,7,2,null,null,null,null,null,1))
        assertEquals(5, result2?.`val`)
        assertEquals(4, result2?.left?.`val`)
        assertEquals(11, result2?.left?.left?.`val`)
        assertNull(result2?.left?.right)
        assertEquals(8, result2?.right?.`val`)
        assertEquals(13, result2?.right?.left?.`val`)
        assertEquals(4, result2?.right?.right?.`val`)
        assertNull(result2?.right?.right?.left)
        assertEquals(1, result2?.right?.right?.right?.`val`)
    }
}
