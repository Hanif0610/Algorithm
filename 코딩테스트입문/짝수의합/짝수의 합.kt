package 코딩테스트입문.짝수의합

/**
 * 정수 n이 주어질 때, n이하의 짝수를 모두 더한 값을 return 하도록 solution 함수를 작성해주세요.
 * 0 < n ≤ 1000
 * */

class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 0
        for (i in 2 .. n step 2)
            answer += i
        return answer
    }
}

fun main() {
    var s = Solution()
    println(s.solution(10))
}