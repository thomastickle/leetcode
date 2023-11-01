package com.github.thomastickle.leetcode.problem

class Problem100 {

    fun isSameTree(p: TreeNode?, q: TreeNode?): Boolean {
        return when {
            p === q -> true
            p == null || q ==null -> false
            else -> p.`val` == q.`val` && isSameTree(p.left, q.left) && isSameTree(p.right, q.right)
        }
    }
}