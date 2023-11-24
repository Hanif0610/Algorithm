package 코딩테스트입문

/**
 * 정수 num1, num2가 매개변수로 주어질 때, num1를 num2로 나눈 나머지를 return 하도록 solution 함수를 완성해주세요.
 * 0 < num1 ≤ 100
 * 0 < num2 ≤ 100
 * */

class Solution {
    fun solution(num1: Int, num2: Int): Int = num1 % num2
}

fun main() {
    var s = Solution()
    println(s.solution(10, 5))
}