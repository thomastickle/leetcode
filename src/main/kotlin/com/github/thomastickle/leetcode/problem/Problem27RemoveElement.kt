package com.github.thomastickle.leetcode.problem

class Problem27RemoveElement {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        val toList = nums.filter { it != `val` }.toIntArray()
        toList.forEachIndexed{ index, element ->
            nums[index] = element
        }
        return toList.size
    }
}