package 코딩테스트입문.두수의차

/**
 * 정수 num1과 num2가 주어질 때, num1에서 num2를 뺀 값을 return하도록 soltuion 함수를 완성해주세요.
 * -50000 ≤ num1 ≤ 50000
 * -50000 ≤ num2 ≤ 50000
 * */

class Solution {
    fun solution(num1: Int, num2: Int): Int = num1 - num2
}

fun main() {
    var s = Solution()
    println(s.solution(2, 1))
}