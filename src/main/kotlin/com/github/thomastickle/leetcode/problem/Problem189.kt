package com.github.thomastickle.leetcode.problem

class Problem189 {
    fun rotate(nums: IntArray, k: Int): Unit {
        val temp = IntArray(nums.size)
        for (i in nums.indices) {
            val insertion = (i+k) % nums.size;
            temp[insertion] = nums[i]
        }

        for(i in nums.indices) {
            nums[i] = temp[i]
        }
    }
}
