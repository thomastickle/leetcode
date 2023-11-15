package com.github.thomastickle.leetcode.problem


class Problem21 {

    fun mergeTwoLists(list1: ListNode?, list2: ListNode?) : ListNode? {
        val result = ListNode(0)
        var head1 = list1
        var head2 = list2
        var current: ListNode? = result

        while(head1 != null && head2 != null) {
            if (head1.`val` < head2.`val`) {
                current?.next = head1
                head1 = head1.next
            } else {
                current?.next = head2
                head2 = head2.next
            }
            current = current?.next
        }

        if (head1 != null) {
            current?.next = head1
        } else {
            current?.next = head2
        }

        return result.next
    }
}
