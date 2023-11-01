package com.github.thomastickle.leetcode.problem

import kotlin.math.max

class Problem104 {
    fun maxDepth(root: TreeNode?): Int {
        if (root == null) return 0
        val leftDepth = maxDepth(root.left)
        val rightDepth = maxDepth(root.right)
        return 1 + max(leftDepth, rightDepth)
    }
}