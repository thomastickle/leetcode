package com.github.thomastickle.leetcode.problem

class Problem70 {
    fun climbStairs(n: Int): Int {
        if (n <= 2)  return n



        var prevPrev = 1
        var prev = 2

        for (i in 3..n) {
            val current = prevPrev + prev
            prevPrev = prev
            prev = current
        }


        return prev
    }
}
