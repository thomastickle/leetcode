package com.github.thomastickle.leetcode.problem

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

class Problem94 {

    fun inorderTraversal(root: TreeNode?): List<Int> {
        return when (root) {
            null -> emptyList()
            else -> inorderTraversal(root.left) + listOf(root.`val`) + inorderTraversal(root.right)
        }
    }
}
