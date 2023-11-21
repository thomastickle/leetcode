package com.github.thomastickle.leetcode.problem

class Problem15 {
    fun threeSum(nums: IntArray): List<List<Int>> {
        nums.sort()
        val result = mutableListOf<List<Int>>()

        for (i in 0 until nums.size - 2) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue

            var low = i + 1
            var high = nums.size - 1

            while (low < high) {
                when {
                    nums[i] + nums[low] + nums[high] > 0 -> high--
                    nums[i] + nums[low] + nums[high] < 0 -> low++
                    else -> {
                        result.add(listOf(nums[i], nums[low], nums[high]))
                        low++
                        while (low < high && nums[low] == nums[low - 1]) low++
                    }
                }
            }
        }
        return result
    }
}
