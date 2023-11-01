package com.github.thomastickle.leetcode.problem

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class Problem71Test {

    val problem = Problem71()

    @Test
    fun deleteDuplicates() {
        val list: ListNode? = constructListFromValues(1,1,2,3,3)
        val resultList = problem.deleteDuplicates(list)
        assertEquals(1, resultList!!.`val`)
        assertEquals(2, resultList.next!!.`val`)
        assertEquals(3, resultList.next!!.next!!.`val`)
    }




}