package 코딩테스트입문.편지

class Solution {
    fun solution(message: String): Int = message.length * 2
}

fun main() {
    var s = Solution()
    println(s.solution("happy birthday!"))
}