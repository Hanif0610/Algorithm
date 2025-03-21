package Level1.덧칠하기

class Solution {
    fun solution(n: Int, m: Int, section: IntArray): Int {
        var answer = 0
        var paintedUntil = -1

        for (s in section) {
            if (s > paintedUntil) {
                answer++
                paintedUntil = s + m - 1
            }
        }

        return answer
    }
}

fun main() {
    println(Solution().solution(5, 2, intArrayOf(1, 4, 5)))
}