package com.github.thomastickle.leetcode.problem

class Problem108 {
    fun sortedArrayToBST(nums: IntArray): TreeNode? {
        fun insertNodeIntoTree(nums: IntArray, left: Int, right: Int): TreeNode? {
            if (left > right) return null
            val mid = left + (right - left) / 2
            val node = TreeNode(nums[mid])
            node.left = insertNodeIntoTree(nums, left, mid - 1)
            node.right = insertNodeIntoTree(nums, mid + 1, right)
            return node
        }


        if (nums.isEmpty()) return null
        return insertNodeIntoTree(nums, 0, nums.size - 1)
    }
}
