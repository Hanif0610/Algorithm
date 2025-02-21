package 코딩테스트입문.두수의곱

/**
 * 정수 num1, num2가 매개변수 주어집니다. num1과 num2를 곱한 값을 return 하도록 solution 함수를 완성해주세요.
 * 0 ≤ num1 ≤ 100
 * 0 ≤ num2 ≤ 100
 * */

class Solution {
    fun solution(num1: Int, num2: Int): Int = num1 * num2
}

fun main() {
    var s = Solution()
    println(s.solution(1, 2))
}