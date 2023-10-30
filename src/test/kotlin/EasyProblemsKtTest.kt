import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class EasyProblemsKtTest {

    @Test
    fun twoSum() {
        val nums: IntArray = intArrayOf(2,7, 11, 15)
        val target = 9
        val indexes = twoSum(nums, target)
        assertArrayEquals(intArrayOf(0,1), indexes)

        val nums2 = intArrayOf(3,2,4)
        val target2 = 6
        val indexes2 = twoSum(nums2, target2)
        assertArrayEquals(intArrayOf(1,2), indexes2)

        val nums3 = intArrayOf(3,3)
        val target3 = 6
        val indexes3 = twoSum(nums3, target3)
        assertArrayEquals(intArrayOf(0,1), indexes3)
    }

    @Test
    fun isPalindrome() {
        assertTrue(isPalindrome(121))
        assertFalse(isPalindrome(-121))
        assertFalse(isPalindrome(10))
        assertTrue(isPalindrome(11))
    }

    @Test
    fun romanToInt() {
        assertEquals(3, romanToInt("III"))
        assertEquals(58, romanToInt("LVIII"))
        assertEquals(1994, romanToInt("MCMXCIV"))
    }

    @Test
    fun longestCommonPrefix() {
        assertEquals("fl", longestCommonPrefix(arrayOf("flower", "flow", "flight")))
        assertEquals("", longestCommonPrefix(arrayOf("dog", "racecar", "car")))
        assertEquals("a", longestCommonPrefix(arrayOf("a")))
        assertEquals("a", longestCommonPrefix(arrayOf("ab", "a")))
        assertEquals("flower", longestCommonPrefix(arrayOf("flower","flower","flower","flower")))
    }

    @Test
    fun isValid() {
        assertTrue(isValid("()"))
        assertTrue(isValid("()[]{}"))
        assertFalse(isValid("(]"))
        assertFalse(isValid("["))
        assertFalse(isValid("]"))
    }

    @Test
    fun constructListFromArray() {
        val list = constructListFromValues(1, 2, 4)
        assertNotNull(list)
        assertEquals(1, list!!.`val`)
        assertEquals(2, list.next!!.`val`)
        assertEquals(4, list.next!!.next!!.`val`)

        val list2 = constructListFromValues()
        assertNull(list2)
    }

    private fun verifyList(values: List<Int>, list: ListNode?): Boolean {
        var current = list;
        for ( i in values) {
            if (current == null || i != current.`val`) {
                return false
            }
            current = current.next
        }
        return true
    }

    @Test
    fun mergeTwoLists() {
        val list = mergeTwoLists(constructListFromValues(1, 2, 4), constructListFromValues(1, 3, 4))
        assertTrue(verifyList(listOf(1, 1, 2, 3, 4, 4), list))

        val list2 = mergeTwoLists(null, null)
        assertTrue(verifyList(emptyList(), list2))

        val list3 = mergeTwoLists(null, constructListFromValues(0))
        assertTrue(verifyList(emptyList(), list3))
    }



}