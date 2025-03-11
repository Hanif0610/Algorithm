package Level0.두수의나눗셈

/**
 * 정수 num1과 num2가 매개변수로 주어질 때, num1을 num2로 나눈 값에 1,000을 곱한 후 정수 부분을 return 하도록 soltuion 함수를 완성해주세요.
 * 0 < num1 ≤ 100
 * 0 < num2 ≤ 100
 * */

class Solution {
    fun solution(num1: Int, num2: Int): Int = ((num1.toFloat() / num2) * 1000).toInt()
}

fun main() {
    var s = Solution()
    println(s.solution(1, 2))
}