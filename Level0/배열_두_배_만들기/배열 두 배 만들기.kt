package Level0.배열_두_배_만들기

class Solution {
    fun solution(numbers: IntArray): IntArray = numbers.map { it * 2 }.toIntArray()
}

fun main(args: Array<String>) {
    var s = Solution()
    println(s.solution(intArrayOf(1, 2, 3, 4, 5)).contentToString())
}