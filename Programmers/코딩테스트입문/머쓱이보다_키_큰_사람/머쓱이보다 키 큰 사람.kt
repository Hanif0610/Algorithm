package 코딩테스트입문.머쓱이보다_키_큰_사람

class Solution {
    fun solution(array: IntArray, height: Int): Int = array.count { it > height }
}

fun main(args: Array<String>) {
    var s = Solution()
    println(s.solution(intArrayOf(149, 190, 192, 170), 167))
}