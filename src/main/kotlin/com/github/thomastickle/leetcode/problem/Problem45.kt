package com.github.thomastickle.leetcode.problem

class Problem45 {
    fun jump(nums: IntArray): Int {
        var jumps = 0
        var farthest = 0;
        var end = 0

        for (i in nums.indices) {
            farthest = maxOf(farthest, i + nums[i])
            if (end == i && i < nums.lastIndex) {
                jumps++
                end = farthest
            }
        }

        return jumps
    }
}
