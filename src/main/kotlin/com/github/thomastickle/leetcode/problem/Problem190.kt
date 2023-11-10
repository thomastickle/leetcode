package com.github.thomastickle.leetcode.problem

class Problem190 {
    fun reverseBits(n:Int):Int {
        var result = 0
        for (i in 0..31)
            result = (result shl 1) or ((n ushr i) and 1)

        return result
    }
}
