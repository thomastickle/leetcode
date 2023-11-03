package com.github.thomastickle.leetcode.problem

class Problem112 {


    fun hasPathSum(root: TreeNode?, targetSum: Int): Boolean {
        if (root == null) return false
        if (root.left == null && root.right == null && root.`val` == targetSum) return true
        val left = hasPathSum(root.left, targetSum - root.`val`)
        val right = hasPathSum(root.right, targetSum - root.`val`)
        return left || right
    }
}
