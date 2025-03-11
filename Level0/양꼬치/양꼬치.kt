package Level0.양꼬치

class Solution {
    fun solution(n: Int, k: Int): Int = (n * 12_000) + (k * 2_000) - (n / 10 * 2_000)
}

fun main() {
    var s = Solution()
    println(s.solution(64, 6))
}