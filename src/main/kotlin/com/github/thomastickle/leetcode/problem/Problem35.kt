package com.github.thomastickle.leetcode.problem

class Problem35 {
    fun searchInsert(nums: IntArray, target: Int): Int {
        var left = 0
        var right = nums.size - 1
        while (left <= right) {
            val pivot = (left + right) / 2
            when {
                nums[pivot] == target -> return pivot
                nums[pivot] > target -> right = pivot - 1
                nums[pivot] < target -> left = pivot + 1
            }

        }
        return left
    }
}