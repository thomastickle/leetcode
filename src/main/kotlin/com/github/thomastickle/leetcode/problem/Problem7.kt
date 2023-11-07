package com.github.thomastickle.leetcode.problem

class Problem7 {
    fun reverse(x: Int): Int {
        var currentVal = x

        var result = 0;
        while (currentVal != 0) {
            result = result * 10 + currentVal % 10
            if (result % 10 != currentVal % 10) {
                return 0
            }
            currentVal /= 10
        }

        return result
    }
}
