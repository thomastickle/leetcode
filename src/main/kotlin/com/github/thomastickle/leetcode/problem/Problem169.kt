package com.github.thomastickle.leetcode.problem

class Problem169 {
    fun majorityElement(nums: IntArray): Int {
        var count = 0
        var candidate = 0
        nums.forEach {
            if (count == 0) {
                candidate = it
            }
            count += if (it == candidate) 1 else -1
        }
        return candidate
    }
}
