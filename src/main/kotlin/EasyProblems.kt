// LeetCode Problem 1
fun twoSum(nums: IntArray, target: Int): IntArray {
    for (i in 0 until nums.size) {
        val remainder = target - nums[i]
        for (j in (i + 1)..<nums.size) {
            if (nums[j] == remainder) {
                return intArrayOf(i, j)
            }
        }
    }

    return intArrayOf()
}

// LeetCode Problem 9
fun isPalindrome(x: Int): Boolean {
    val asString = x.toString()
    var start = 0
    var end = asString.length - 1
    while (start <= end) {
        if (asString[start] != asString[end]) {
            return false;
        }
        start += 1
        end -= 1
    }
    return true;
}

// LeetCode Problem 13

val ROMAN_NUMERAL_LOOKUP_MAP =
    mapOf(Pair('I', 1), Pair('V', 5), Pair('X', 10), Pair('L', 50), Pair('C', 100), Pair('D', 500), Pair('M', 1000))

fun romanToInt(s: String): Int {
    var accumulator = 0;
    var i = 0;
    while (i < s.length) {
        val x = ROMAN_NUMERAL_LOOKUP_MAP[s[i]]!!
        if (i < (s.length - 1) && x < ROMAN_NUMERAL_LOOKUP_MAP[s[i + 1]]!!) {
            accumulator += ROMAN_NUMERAL_LOOKUP_MAP[s[i + 1]]!! - x
            i += 2
            continue
        } else {
            accumulator += x
            i += 1
        }
    }

    return accumulator;
}

// Problem 14
fun longestCommonPrefix(strs: Array<String>): String {
    if (strs.isEmpty()) {
        return ""
    }
    var commonString = strs[0]
    strs.forEach { value  ->
        if (commonString.length > value.length) {
            commonString = commonString.substring(0, value.length)
        }
        for (i in 0..<commonString.length) {
            if (commonString[i] != value[i]) {
                commonString = commonString.substring(0, i)
                break
            }
        }
    }
    return commonString
}