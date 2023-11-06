package com.github.thomastickle.leetcode.problem

class Problem144 {
    fun preorderTraversal(root: TreeNode?): List<Int> {
        if (root ==  null) return emptyList()

        return listOf(root.`val`) + preorderTraversal(root.left) + preorderTraversal(root.right)
    }
}