package com.github.thomastickle.leetcode.problem

class Problem380 {

    private val localSet = mutableSetOf<Int>()

    fun insert(`val`: Int): Boolean {
        return localSet.add(`val`)
    }

    fun remove(`val`: Int): Boolean {
        return localSet.remove(`val`)
    }

    fun getRandom(): Int {
        return localSet.random()
    }
}
