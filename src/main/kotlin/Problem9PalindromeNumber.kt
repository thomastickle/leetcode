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
