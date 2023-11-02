package com.github.thomastickle.leetcode.problem

import java.util.*

class Problem111 {

    fun minDepth(root: TreeNode?): Int {
        if (root == null) return 0

        var level = 1
        val queue: Queue<TreeNode> = LinkedList()
        queue.add(root)
        while (queue.isNotEmpty()) {
            for (i in 1..queue.size) {
                val currentNode = queue.poll()
                if (currentNode.left == null && currentNode.right == null) return level
                if (currentNode.left != null) queue += currentNode.left
                if (currentNode.right != null) queue += currentNode.right
            }
            level += 1
        }
        return level
    }
}
