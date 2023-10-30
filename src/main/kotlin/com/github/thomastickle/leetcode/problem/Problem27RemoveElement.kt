package com.github.thomastickle.leetcode.problem

class Problem27RemoveElement {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        var count = 0
        nums.forEach {
            if (it != `val`)
                nums[count++] = it
        }
        return count
    }
}