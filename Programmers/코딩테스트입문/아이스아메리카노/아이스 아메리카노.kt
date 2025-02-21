package 코딩테스트입문.아이스아메리카노

class Solution {
    fun solution(money: Int): IntArray = intArrayOf( money / 5500, money % 5500)
}

fun main() {
    var s = Solution()
    println(s.solution(15000).contentToString())
}