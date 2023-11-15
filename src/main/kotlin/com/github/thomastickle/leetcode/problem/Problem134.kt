package com.github.thomastickle.leetcode.problem

class Problem134 {
    fun canCompleteCircuit(gas: IntArray, cost: IntArray): Int {
        val (start, _, sumOfGas) = gas.foldIndexed(Triple(0, 0, 0)) { index, acc, value ->
            var (start, tank, sumOfGas) = acc
            tank += value - cost[index]
            sumOfGas += value - cost[index]

            if (tank < 0) {
                start = index + 1
                tank = 0
            }
            Triple(start, tank, sumOfGas)
        }

        return if (sumOfGas >= 0) start else -1
    }
}
