package com.github.thomastickle.leetcode.problem

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class Problem104Test {

    val problem = Problem104()

    @Test
    fun maxDepth() {
        val root = TreeNode(3);
        root.left = TreeNode(9);
        root.right =  TreeNode(20);
        root.right!!.left = TreeNode(15)
        root.right!!.right = TreeNode(7)
        assertEquals(3, problem.maxDepth(root))
    }
}