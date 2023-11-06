package com.github.thomastickle.leetcode.problem

import kotlin.math.max

class Problem3 {
    fun lengthOfLongestSubstring(s: String): Int {
        var longest = 0
        var startPoint = 0
        var endPoint = startPoint
        val charMap = mutableMapOf<Char, Int>()

        while (endPoint < s.length) {
            val current = s[endPoint]
            if (charMap.containsKey(current)) {
                startPoint = max(startPoint, charMap[current]?.plus(1) ?: startPoint)
                if (endPoint - startPoint > longest) {

                }

            }

            longest = max(longest, (endPoint - startPoint) + 1)

            charMap[current] = endPoint
            endPoint++
        }


        return longest
    }
}