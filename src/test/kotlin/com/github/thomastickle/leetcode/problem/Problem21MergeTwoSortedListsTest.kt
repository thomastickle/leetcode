package com.github.thomastickle.leetcode.problem

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class Problem21MergeTwoSortedListsTest {

    fun constructListFromValues(vararg values: Int): ListNode? {
        var head: ListNode? = null
        var current: ListNode? = null
        values.forEach {
            if (head == null) {
                head = ListNode(it)
                current = head
            } else {
                current?.next = ListNode(it)
                current = current?.next
            }
        }
        return head
    }

    @Test
    fun constructListFromArray() {
        val list = constructListFromValues(1, 2, 4)
        assertNotNull(list)
        assertEquals(1, list!!.`val`)
        assertEquals(2, list.next!!.`val`)
        assertEquals(4, list.next!!.next!!.`val`)

        val list2 = constructListFromValues()
        assertNull(list2)
    }

    private fun verifyList(values: List<Int>, list: ListNode?): Boolean {
        var current = list;
        for ( i in values) {
            if (current == null || i != current.`val`) {
                return false
            }
            current = current.next
        }
        return true
    }

    @Test
    fun mergeTwoLists() {
        val list = Problem21MergeTwoSortedLists().mergeTwoLists(constructListFromValues(1, 2, 4), constructListFromValues(1, 3, 4))
        assertTrue(verifyList(listOf(1, 1, 2, 3, 4, 4), list))

        val list2 = Problem21MergeTwoSortedLists().mergeTwoLists(null, null)
        assertTrue(verifyList(emptyList(), list2))

        val list3 = Problem21MergeTwoSortedLists().mergeTwoLists(null, constructListFromValues(0))
        assertTrue(verifyList(emptyList(), list3))
    }
}