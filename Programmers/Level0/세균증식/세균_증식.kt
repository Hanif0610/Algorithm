package Programmers.Level0.세균증식

class Solution {
    fun solution(n: Int, t: Int): Int {
        var answer = n
        (0 until t).forEach { i ->
            answer *= 2
        }
        return answer
    }

    //fun solution(n: Int, t: Int): Int  = n shl t //shl -> shift 연산자
}

fun main() {
    println(Solution().solution(7, 15))
}