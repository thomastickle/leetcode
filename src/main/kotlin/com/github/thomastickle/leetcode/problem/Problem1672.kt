package com.github.thomastickle.leetcode.problem

import kotlin.math.max

class Problem1672 {
    fun maximumWealth(accounts: Array<IntArray>): Int {
        val richest = accounts.map {
            it.sum()
        }.reduceRight { i, acc -> max(i, acc) }
        return richest
    }
}
