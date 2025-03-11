package Programmers.Level1.문자열을정수로바꾸기

class Solution {
    fun solution(s: String): Int {
        return s.toInt()
    }
}

fun main(args: Array<String>) {
    val solution = Solution()
    println(solution.solution("123"))
}