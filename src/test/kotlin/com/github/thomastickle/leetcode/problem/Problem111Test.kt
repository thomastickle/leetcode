package com.github.thomastickle.leetcode.problem

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class Problem111Test {

    val problem = Problem111()

    @Test
    fun minDepth() {
        assertEquals(0, problem.minDepth(null))

        val root = TreeNode(3);
        assertEquals(1, problem.minDepth(root))

        root.left = TreeNode(9);
        root.right =  TreeNode(20);
        root.right!!.left = TreeNode(15)
        root.right!!.right = TreeNode(7)

        assertEquals(2, problem.minDepth(root))
    }
}
