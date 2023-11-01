package com.github.thomastickle.leetcode.problem

class Problem71 {
    fun deleteDuplicates(head: ListNode?): ListNode? {
        if (head == null || head?.next == null) {
            return head
        }
        var currentNode = head
        while (currentNode?.next != null) {
            if (currentNode.`val` == currentNode.next!!.`val`) {
                currentNode.next = currentNode.next?.next
            } else {
                currentNode = currentNode.next
            }
        }
        return head
    }
}