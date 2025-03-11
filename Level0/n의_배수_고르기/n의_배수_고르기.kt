package Level0.n의_배수_고르기

class Solution {
    fun solution(n: Int, numlist: IntArray): IntArray = numlist.filter { it % n == 0 }.toIntArray()
}

fun main() {
    println(Solution().solution(3, intArrayOf(4, 5, 6, 7, 8, 9, 10, 11, 12)).contentToString())
}