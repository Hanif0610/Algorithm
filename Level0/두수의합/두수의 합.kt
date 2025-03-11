package Level0.두수의합

/**
 * 정수 num1과 num2가 주어질 때, num1과 num2의 합을 return하도록 soltuion 함수를 완성해주세요.
 * -50,000 ≤ num1 ≤ 50,000
 * -50,000 ≤ num2 ≤ 50,000
 * */

class Solution {
    fun solution(num1: Int, num2: Int): Int = num1 + num2
}

fun main() {
    var s = Solution()
    println(s.solution(1, 2))
}