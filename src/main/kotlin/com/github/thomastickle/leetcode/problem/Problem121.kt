package com.github.thomastickle.leetcode.problem

class Problem121 {
    fun maxProfit(prices: IntArray): Int {
        var min = prices[0]
        var profit = 0
        prices.forEach {
            if (it < min) min = it
            profit = maxOf(profit, it-min)
        }
        return profit
    }
}
