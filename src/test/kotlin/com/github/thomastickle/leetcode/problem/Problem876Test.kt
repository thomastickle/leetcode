package com.github.thomastickle.leetcode.problem

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class Problem876Test {

    val problem876 = Problem876()

    @Test
    fun middleNode() {
        val list = constructListFromValues(1)
        assertEquals(1, problem876.middleNode(list)?.`val`)

        val list2 = constructListFromValues(1,2,3,4,5)
        assertEquals(3, problem876.middleNode(list2)?.`val`)

        val list3 = constructListFromValues(1,2,3,4,5, 6)
        assertEquals(4, problem876.middleNode(list3)?.`val`)
    }
}
