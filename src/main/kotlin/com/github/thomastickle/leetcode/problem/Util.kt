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

fun constructTreeFromValues(treeValues: List<Int?>): TreeNode? {
    fun constructTree(list: List<Int?>, start: Int): TreeNode? {
        if (start > list.size - 1 || list[start] == null) return null
        val node = TreeNode(list[start]!!)

        node.left = constructTree(list, 2 * start + 1)
        node.right = constructTree(list, 2 * start + 2)

        return node;
    }


    if (treeValues.isEmpty() || treeValues[0] == null) return null

    val root = TreeNode(treeValues[0]!!)
    root.left = constructTree(treeValues, 1)
    root.right = constructTree(treeValues, 2)

    return root
}
