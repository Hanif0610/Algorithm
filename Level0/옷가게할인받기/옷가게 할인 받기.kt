package Level0.옷가게할인받기

class Solution {
    fun solution(price: Int): Int =
        when {
            (price >= 500000) -> (price - (price * 0.2)).toInt()
            (price >= 300000) -> (price - (price * 0.1)).toInt()
            (price >= 100000) -> (price - (price * 0.05)).toInt()
            else -> price
        }
}

fun main() {
    var s = Solution()
    println(s.solution(580000))
}