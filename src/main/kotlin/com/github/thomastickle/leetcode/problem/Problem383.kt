package com.github.thomastickle.leetcode.problem

class Problem383 {
    fun canConstruct(ransomNote: String, magazine: String): Boolean {
        val magazinePool = magazine.fold(mutableMapOf<Char, Int>()) { acc, c ->
            if (acc[c] == null) {
                acc[c] = 1
            } else {
                acc[c] = acc[c]!! + 1
            }
            acc
        }

        ransomNote.forEach { c ->
            if (magazinePool[c] == null || magazinePool[c] == 0) {
                return false
            }
            magazinePool[c] = magazinePool[c]!! - 1
        }

        return true
    }
}
