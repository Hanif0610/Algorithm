package Level0.숨어있는숫자의덧셈1

class Solution {
    fun solution(my_string: String): Int = my_string
        .replace("[a-z|A-Z]".toRegex(), "")
        .sumOf { x -> x - '0' }
}

fun main() {
    var s = Solution()
    println(s.solution("aAb1B2cC34oOp"))
}