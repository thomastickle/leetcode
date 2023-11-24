package com.github.thomastickle.leetcode.problem

class Problem36 {
    fun isValidSudoku(board: Array<CharArray>): Boolean {
        for (col in 0 until 9) {

            val rowSet = mutableSetOf<Char>()
            val columnSet = mutableSetOf<Char>()
            val blockSet = mutableSetOf<Char>()

            for (row in 0 until 9) {
                val r = board[row][col]
                val c = board[col][row]

                if (r != '.' && !rowSet.add(r)) return false
                if (c != '.' && !columnSet.add(c)) return false

                val rowIndex = 3*(col / 3) + row / 3
                val columnIndex = 3*(col % 3) + row % 3

                val x = board[rowIndex][columnIndex]

                if (x != '.' && !blockSet.add(x)) return false
            }
        }

        return true
    }
}
