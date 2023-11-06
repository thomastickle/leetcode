package com.github.thomastickle.leetcode.problem

class Problem2 {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        val head = ListNode(0)
        var prev = head
        var current1 = l1
        var current2 = l2
        var carry = 0
        while (current1 != null && current2 != null) {
            val value = current1.`val` + current2.`val` + carry
            prev.next = ListNode(value % 10)
            carry = value / 10
            current1 = current1.next
            current2 = current2.next
            prev = prev.next!!

        }

        while (current1 != null) {
            val value = current1.`val` + carry
            prev.next = ListNode(value % 10)
            carry = value / 10
            current1 = current1.next
            prev = prev.next!!
        }

        while (current2 != null) {
            val value = current2.`val` + carry
            prev.next = ListNode(value % 10)
            carry = value / 10
            current2 = current2.next
            prev = prev.next!!
        }

        if (carry > 0) {
            prev.next = ListNode(1)

        }

        return head.next
    }
}