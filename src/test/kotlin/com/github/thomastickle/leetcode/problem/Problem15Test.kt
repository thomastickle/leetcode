package com.github.thomastickle.leetcode.problem

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class Problem15Test {

    val problem15 = Problem15()

    @Test
    fun threeSum() {
        val result1 = problem15.threeSum(intArrayOf(-1,0,1,2,-1,4))
        assertTrue(result1.contains(listOf(-1,-1,2)))
        assertTrue(result1.contains(listOf(-1,0,1)))

        val result2 = problem15.threeSum(intArrayOf(0,1,1))
        assertTrue(result2.isEmpty())

        val result3 = problem15.threeSum(intArrayOf(0,0,0))
        assertTrue(result3.contains(listOf(0,0,0)))

        val result4 = problem15.threeSum(intArrayOf(-1,0,1,2,-1,-4))
        assertTrue(result4.contains(listOf(-1,-1,2)))
        assertTrue(result4.contains(listOf(-1,0,1)))

        val result5 = problem15.threeSum((intArrayOf(0,0,0,0)))
        assertTrue(result5.contains(listOf(0,0,0)))
    }
}
