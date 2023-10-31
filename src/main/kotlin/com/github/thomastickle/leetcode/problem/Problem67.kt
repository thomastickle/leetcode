package com.github.thomastickle.leetcode.problem

class Problem67 {
    fun addBinary(a: String, b: String): String {
        val length = if (a.length > b.length) a.length else b.length
        val a1 = a.padStart(length, '0')
        val b1 = b.padStart(length, '0')
        var carry = false
        val output = StringBuilder()
        var i = length - 1

        while (i > -1) {
            when {
                carry -> {
                    when {
                        a1[i] == '0' && b1[i] == '0' -> {
                            output.append('1')
                            carry = false
                        }
                        a1[i] == '1' && b1[i] == '1' -> {
                            output.append('1')
                        }
                        else -> {
                            output.append('0')
                        }
                    }
                }
                else -> {
                    when {
                        a1[i] == '1' && b1[i] == '1' -> {
                            output.append('0')
                            carry = true
                        }
                        a1[i] == '1' || b1[i] == '1' -> {
                            output.append('1')
                        }
                        else -> {
                            output.append('0')
                        }
                    }
                }
            }
            i--
        }

        if (carry) {
            output.append('1')
        }


        return output.reverse().toString()
    }
}