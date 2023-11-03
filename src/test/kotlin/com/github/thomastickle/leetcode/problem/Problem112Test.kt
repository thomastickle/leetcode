package com.github.thomastickle.leetcode.problem

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class Problem112Test {

    val problem = Problem112()

    @Test
    fun hasPathSum() {
        val tree = constructTreeFromValues(listOf(1,2,3))
        assertFalse(problem.hasPathSum(tree,5))

        val tree2 = constructTreeFromValues(listOf(5,4,8,11,null,13,4,7,2,null,null,null,null,null,1))
        assertTrue(problem.hasPathSum(tree2, 22))
    }
}
