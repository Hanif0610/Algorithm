package Programmers.Level0.자릿수_더하기

class Solution {
    fun solution(n: Int): Int = n.toString().map { it.digitToInt() }.sum()
}

fun main() {
    println(Solution().solution(1234))
}