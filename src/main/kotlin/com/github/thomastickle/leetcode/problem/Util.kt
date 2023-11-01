package com.github.thomastickle.leetcode.problem

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