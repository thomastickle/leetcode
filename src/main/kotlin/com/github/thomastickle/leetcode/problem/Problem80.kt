package com.github.thomastickle.leetcode.problem

class Problem80 {
    fun removeDuplicates(nums: IntArray): Int {
        var insertionPointer = 0
        var scanPointer = 0
        var currentValue = 0


        while (scanPointer < nums.size) {
            currentValue = nums[scanPointer];
            var count = 0
            while (scanPointer < nums.size && currentValue == nums[scanPointer] && count < 2) {
                nums[insertionPointer++] = nums[scanPointer++]
                count++
            }

            while (scanPointer < nums.size && currentValue == nums[scanPointer]) {
                scanPointer++
            }
        }

        return insertionPointer
    }
}
