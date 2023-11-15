package com.github.thomastickle.leetcode.problem



class Problem94 {

    fun inorderTraversal(root: TreeNode?): List<Int> {
        return when (root) {
            null -> emptyList()
            else -> inorderTraversal(root.left) + listOf(root.`val`) + inorderTraversal(root.right)
        }
    }
}
