package com.github.thomastickle.leetcode.problem

class Problem12 {

//    val ROMAN_NUMERAL_MAP = mapOf(
//        1000 to "M",
//        900 to "CM",
//        500 to "D",
//        400 to "CD",
//        100 to "C",
//        90 to "XC",
//        50 to "L",
//        40 to "XL",
//        10 to "X",
//        9 to "IX",
//        5 to "V",
//        4 to "IV",
//        1 to "I"
//    )


    val values = intArrayOf(1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1)
    val romanValue = arrayOf("M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I")

    fun intToRoman(num: Int): String {
        var number = num;
        var output = StringBuffer()

        for (i in values.indices) {
            while(number >= values[i]) {
                output.append(romanValue[i])
                number -= values[i]
            }
        }

        return  output.toString()
    }
}
