package 코딩테스트입문.공_던지기

class Solution {
    fun solution(numbers: IntArray, k: Int): Int = numbers[(k - 1) * 2 % numbers.size]
}

fun main() {
    println(Solution().solution(intArrayOf(1, 2, 3, 4, 5, 6), 5))
}