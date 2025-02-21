package 코딩테스트입문.배열의평균값

class Solution {
    fun solution(numbers: IntArray): Double = numbers.average()
}

fun main() {
    var s = Solution()
    println(s.solution(intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)))
}