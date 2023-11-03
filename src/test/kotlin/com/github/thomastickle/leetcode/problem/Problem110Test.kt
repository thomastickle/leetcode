package com.github.thomastickle.leetcode.problem

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class Problem110Test {

    val problem = Problem110()

    @Test
    fun isBalanced() {
        assertTrue(problem.isBalanced(null))
        val root = TreeNode(3)
        root.left = TreeNode(9)
        root.right =  TreeNode(20)
        root.right!!.left = TreeNode(15)
        root.right!!.right = TreeNode(7)
        assertTrue(problem.isBalanced(root))
    }
}
