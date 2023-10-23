

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