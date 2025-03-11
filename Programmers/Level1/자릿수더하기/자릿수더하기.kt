package Programmers.Level1.자릿수더하기

class Solution {
    fun solution(n: Int): Int = n.toString().toCharArray().map { it.toString().toInt() }.sum()
}

fun main(args: Array<String>) {
    val solution = Solution()
    println(solution.solution(123))
}