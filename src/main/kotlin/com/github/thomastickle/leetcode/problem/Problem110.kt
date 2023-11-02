package com.github.thomastickle.leetcode.problem

import kotlin.math.abs
import kotlin.math.max

class Problem110 {

    fun maxDepth(root: TreeNode?): Int {
        if (root == null) return 0
        val leftDepth = maxDepth(root.left)
        val rightDepth = maxDepth(root.right)
        return when {
            leftDepth == -1 -> -1
            rightDepth == -1 -> -1
            abs(leftDepth - rightDepth) > 1 -> -1
            else -> 1 + max(leftDepth, rightDepth)
        }
    }

    fun isBalanced(root: TreeNode?): Boolean {
        if (root == null) return true
        return maxDepth(root) != -1
    }
}
