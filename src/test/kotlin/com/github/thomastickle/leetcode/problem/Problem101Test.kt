package com.github.thomastickle.leetcode.problem

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class Problem101Test {

    val problem = Problem101()

    @Test
    fun name() {
        val root = TreeNode(1);
        root.left = TreeNode(2);
        root.left!!.left = TreeNode(3);
        root.left!!.right = TreeNode(4);
        root.right =  TreeNode(2);
        root.right!!.left = TreeNode(4)
        root.right!!.right = TreeNode(3)
        assertTrue(problem.isSymmetric(root))


        root.left = TreeNode(2);
        root.left!!.left = null;
        root.left!!.right = TreeNode(4);
        root.right =  TreeNode(2);
        root.right!!.left = null;
        root.right!!.right = TreeNode(3)
        assertFalse(problem.isSymmetric(root))
    }
}