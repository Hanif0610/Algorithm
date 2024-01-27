package 코딩테스트입문.배열뒤집기

class Solution {
    fun solution(num_list: IntArray): IntArray = num_list.reversedArray()
}

fun main(args: Array<String>) {
    var s = Solution()
    println(s.solution(intArrayOf(1, 2, 3, 4, 5)).contentToString())
}