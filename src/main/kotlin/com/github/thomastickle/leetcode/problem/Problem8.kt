package com.github.thomastickle.leetcode.problem

class Problem8 {
    fun myAtoi(s: String): Int {
        var result = 0
        var index = 0

        while (index < s.length && s[index].isWhitespace()) {
            index++
        }

        if (index >= s.length) {
            return 0
        }


        val sign = when {
            s[index] == '-' -> {
                index++
                -1
            }
            s[index] == '+' -> {
                index++
                1
            }
            !s[index].isDigit() -> return 0
            else -> 1
        }

        while (index < s.length && s[index].isDigit()) {
            val value = s[index] - '0'

            if (result > (Int.MAX_VALUE / 10) || (result == (Int.MAX_VALUE / 10) && value > 7)) {
                return when (sign) {
                    -1 -> Int.MIN_VALUE
                    else -> Int.MAX_VALUE
                }
            }
            result = result * 10 + value
            index += 1
        }
        result *= sign
        return result
    }
}
