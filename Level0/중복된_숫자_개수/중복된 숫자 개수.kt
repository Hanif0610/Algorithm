package Level0.중복된_숫자_개수

class Solution {
    fun solution(array: IntArray, n: Int): Int = array.filter { it == n }.size
}

fun main(args: Array<String>) {
    var s = Solution()
    println(s.solution(intArrayOf(1, 1, 2, 3, 4), 1))
}