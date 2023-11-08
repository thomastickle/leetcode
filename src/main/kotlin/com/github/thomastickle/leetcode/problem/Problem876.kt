package com.github.thomastickle.leetcode.problem

class Problem876 {
    fun middleNode(head: ListNode?): ListNode? {
        var middleNode = head
        var currentNode = head

        while (currentNode?.next != null) {
            middleNode = middleNode?.next
            currentNode = currentNode.next?.next
        }

        return middleNode
    }
}
