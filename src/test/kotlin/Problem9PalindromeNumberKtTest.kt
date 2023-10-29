import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class Problem9PalindromeNumberKtTest {

    @Test
    fun isPalindrome() {
        assertTrue(isPalindrome(121))
        assertFalse(isPalindrome(-121))
        assertFalse(isPalindrome(10))
        assertTrue(isPalindrome(11))
    }
}