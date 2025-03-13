package Level0.최댓값_만들기1

class Solution {
    fun solution(numbers: IntArray): Int = numbers.sortedArrayDescending().take(2).let { (a, b) -> a * b }
//    fun solution(numbers: IntArray): Int = numbers.sorted().takeLast(2).let { (a, b) -> a * b }
}

fun main() {
    println(Solution().solution(intArrayOf(0, 31, 24, 10, 1, 9)))
}