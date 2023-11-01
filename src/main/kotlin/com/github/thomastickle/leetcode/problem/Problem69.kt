package com.github.thomastickle.leetcode.problem

class Problem69 {
    fun mySqrt(x: Int): Int {
        if ( x < 2)  return x
        var left = 2
        var right = x/2
        while (left <= right) {
            val mid = left + (right - left) / 2
            val testValue = mid.toLong() * mid.toLong()
            when {
                testValue < x -> left = mid + 1
                testValue > x -> right = mid - 1
                else -> return mid
            }
        }
        return left - 1
    }
}