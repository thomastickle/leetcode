package com.github.thomastickle.leetcode.problem

import kotlin.math.max
import kotlin.math.min

class Problem11 {

    fun maxArea(height: IntArray): Int {
        var maxArea = 0

        var left = 0
        var right = height.size - 1

        while (left < right) {
            val area = min(height[left], height[right]) * (right - left)
            maxArea = max(maxArea, area)

            if (height[left] < height[right]) left++ else right--
        }

        return maxArea
    }
}