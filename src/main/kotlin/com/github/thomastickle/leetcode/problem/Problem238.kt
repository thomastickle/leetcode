package com.github.thomastickle.leetcode.problem

class Problem238 {
    fun productExceptSelf(nums: IntArray): IntArray {
        val resultArray = IntArray(nums.size) { 1 }
        var product = 1
        for (i in nums.indices) {
            resultArray[i] *= product
            product *= nums[i]
        }

        product = 1
        for (i in nums.indices.reversed()){
            resultArray[i] *= product
            product *= nums[i]
        }

        return resultArray
    }
}
