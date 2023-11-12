package com.github.thomastickle.leetcode.problem

class Problem274 {
    fun hIndex(citations: IntArray): Int {
        return citations.sortedDescending().fold(0){count, item -> if (count < item) count + 1 else count}
    }
}
