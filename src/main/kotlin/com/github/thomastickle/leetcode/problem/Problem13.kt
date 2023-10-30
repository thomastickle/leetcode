package com.github.thomastickle.leetcode.problem

class Problem13 {

    private val ROMAN_NUMERAL_LOOKUP_MAP =
        mapOf(Pair('I', 1), Pair('V', 5), Pair('X', 10), Pair('L', 50), Pair('C', 100), Pair('D', 500), Pair('M', 1000))

    fun romanToInt(s: String): Int {
        var accumulator = 0
        var i = 0
        while (i < s.length) {
            val x = ROMAN_NUMERAL_LOOKUP_MAP[s[i]]!!
            if (i < (s.length - 1) && x < ROMAN_NUMERAL_LOOKUP_MAP[s[i + 1]]!!) {
                accumulator += ROMAN_NUMERAL_LOOKUP_MAP[s[i + 1]]!! - x
                i += 2
                continue
            } else {
                accumulator += x
                i += 1
            }
        }

        return accumulator
    }
}