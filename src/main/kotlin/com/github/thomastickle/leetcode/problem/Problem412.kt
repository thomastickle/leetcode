package com.github.thomastickle.leetcode.problem

class Problem412 {
    fun fizzBuzz(n: Int): List<String> {
        val list = mutableListOf<String>()
        for (i in 1..n) {
            list += when {
                i % 5 == 0 && i % 3 == 0 -> "FizzBuzz"
                i % 5 == 0 -> "Buzz"
                i % 3 == 0 -> "Fizz"
                else -> "$i"
            }
        }
        return list
    }
}
