package com.github.thomastickle.leetcode.problem

import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

class Problem1TwoSumTest {

    @Test
    fun twoSum() {
        val nums: IntArray = intArrayOf(2,7, 11, 15)
        val target = 9
        val indexes = Problem1TwoSum().twoSum(nums, target)
        assertArrayEquals(intArrayOf(0,1), indexes)

        val nums2 = intArrayOf(3,2,4)
        val target2 = 6
        val indexes2 = Problem1TwoSum().twoSum(nums2, target2)
        assertArrayEquals(intArrayOf(1,2), indexes2)

        val nums3 = intArrayOf(3,3)
        val target3 = 6
        val indexes3 = Problem1TwoSum().twoSum(nums3, target3)
        assertArrayEquals(intArrayOf(0,1), indexes3)
    }


}