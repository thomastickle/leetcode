package com.github.thomastickle.leetcode.problem

class Problem118 {
    fun generate(numRows: Int): List<List<Int>> {
        val list = mutableListOf<List<Int>>()

        repeat(numRows) { row ->
            list.add(MutableList(row + 1) {
                when (it) {
                    0, row -> 1
                    else -> list[row - 1][it - 1] + list[row - 1][it]
                }
            })
        }
        return list
    }
}
