package com.github.thomastickle.leetcode.problem

class Problem209 {
    fun minSubArrayLen(target: Int, nums: IntArray): Int {
        val result =  nums.foldIndexed(Triple(Int.MAX_VALUE,0, 0)) { index, acc, i ->
            var (size, sum, high) = acc

            while (sum < target && high < nums.size) {
                sum += nums[high++]
            }

            when {
                sum >= target -> Triple(minOf(size, high - index), sum - nums[index], high)
                else -> Triple(size, sum - nums[index], high)
            }
        }
        return when {
            result.first != Int.MAX_VALUE -> result.first
            else -> 0
        }
    }
}
