package com.github.thomastickle.leetcode.problem

class Problem1 {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        for (i in nums.indices) {
            val remainder = target - nums[i]
            for (j in (i + 1)..<nums.size) {
                if (nums[j] == remainder) {
                    return intArrayOf(i, j)
                }
            }
        }

        return intArrayOf()
    }
}
