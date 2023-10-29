
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