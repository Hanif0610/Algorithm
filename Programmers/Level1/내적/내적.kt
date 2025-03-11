package Programmers.Level1.내적

class Solution {
    fun solution(a: IntArray, b: IntArray): Int {
        return a.zip(b).map { it.first * it.second }.sum() //zip : 두 배열을 같은 인덱스끼리 pair로 묶음
    }
}

fun main(args: Array<String>) {
    val solution = Solution()
    val arr1 = intArrayOf(1, 2, 3, 4)
    val arr2 = intArrayOf(-3, -1, 0, 2)
    println(solution.solution(arr1, arr2))
}