package com.github.thomastickle.leetcode.problem

class Problem88 {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
        var nums1Pointer = m - 1
        var nums2Pointer = n - 1
        var editingPointer = m + n - 1
        while ( nums2Pointer >= 0) {
            nums1[editingPointer--] = if (nums1Pointer >= 0 && nums1[nums1Pointer] > nums2[nums2Pointer]) nums1[nums1Pointer--] else nums2[nums2Pointer--]

        }
    }
}