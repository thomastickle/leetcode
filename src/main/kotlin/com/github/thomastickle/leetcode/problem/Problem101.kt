package com.github.thomastickle.leetcode.problem

class Problem101 {
    fun isSymmetric(root: TreeNode?): Boolean {
        fun recurseSubtree(left: TreeNode?, right: TreeNode?): Boolean {
            if (left === right) return true
            if (left?.`val` != right?.`val`) return false
            return recurseSubtree(left?.left, right?.right) && recurseSubtree(left?.right, right?.left)
        }

        if (root == null) return true
        return recurseSubtree(root.left, root.right)
    }
}