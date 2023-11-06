package com.github.thomastickle.leetcode.problem

class Problem7 {
    fun reverse(x: Int): Int {
        val reversed = if (x >= 0) x.toString().reversed() else x.toString().substring(1).reversed()


        var result = 0;
        try {
            result = reversed.toInt()
            if (x < 0) {
                result = result * -1
            }
        } catch (e: NumberFormatException) {
            // do nothing
        }



        return result
    }
}
