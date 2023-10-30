package com.github.thomastickle.leetcode.problem

class Problem14LongestCommonPrefix {
    fun longestCommonPrefix(strs: Array<String>): String {
        if (strs.isEmpty()) {
            return ""
        }
        var commonString = strs[0]
        strs.forEach { value  ->
            if (commonString.length > value.length) {
                commonString = commonString.substring(0, value.length)
            }
            for (i in commonString.indices) {
                if (commonString[i] != value[i]) {
                    commonString = commonString.substring(0, i)
                    break
                }
            }
        }
        return commonString
    }
}