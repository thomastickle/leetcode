package com.github.thomastickle.leetcode.problem

import kotlin.math.max

class Problem122 {
    fun maxProfit(prices: IntArray): Int {
        return prices.foldIndexed(0) { index, acc, value ->
            if (index == 0) 0 else acc + maxOf(
                0,
                value - prices[index - 1]
            )
        }
    }
}
