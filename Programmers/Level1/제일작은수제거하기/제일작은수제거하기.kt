package Programmers.Level1.제일작은수제거하기

class Solution {
    fun solution(arr: IntArray): IntArray {
        return if(arr.size <= 1) intArrayOf(-1) else arr.filter { i -> i != arr.minOrNull() }.toIntArray()
    }
}

fun main(args: Array<String>) {
    val solution = Solution()
    val arr = intArrayOf(4, 3, 2, 1)
    println(solution.solution(arr).contentToString())
}