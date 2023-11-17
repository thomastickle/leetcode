package com.github.thomastickle.leetcode.problem

class Problem167 {
    fun twoSum(numbers: IntArray, target: Int): IntArray {
        var low = 0
        var high = numbers.size - 1
        var finished = false
        while (low < high && !finished) {
            when {
                numbers[low] + numbers[high] > target ->
                    high--
                numbers[low] + numbers[high] < target ->
                    low++
                numbers[low] + numbers[high] == target ->
                   finished = true
            }
        }
        return intArrayOf(low+1, high+1)
    }
}
