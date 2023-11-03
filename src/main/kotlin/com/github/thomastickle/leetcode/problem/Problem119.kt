package com.github.thomastickle.leetcode.problem

class Problem119 {

    fun generate(numRows: Int): List<List<Int>> {
        val list = mutableListOf<List<Int>>()

        repeat(numRows) { row ->
            list.add(MutableList(row + 1) { it ->
                when (it) {
                    0, row -> 1
                    else -> list[row - 1][it - 1] + list[row - 1][it]
                }
            })
        }
        return list
    }

    fun getRow(rowIndex: Int): List<Int> {
        val triangle = generate(rowIndex + 1)
        return triangle[rowIndex]
    }
}
