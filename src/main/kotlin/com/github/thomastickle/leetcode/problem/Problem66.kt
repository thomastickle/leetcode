package com.github.thomastickle.leetcode.problem

class Problem66 {
    fun plusOne(digits: IntArray): IntArray {
        for ( i in digits.size - 1 downTo 0) {
            when {
                digits[i] < 9 -> {
                    digits[i]++
                    return digits
                }
                else -> digits[i] = 0
            }
        }
        val results = IntArray(digits.size+ 1)
        results[0] = 1
        return results
    }
}