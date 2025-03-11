package Level0.피자_나눠_먹기1

class Solution {
    fun solution(n: Int): Int = if(n % 7 == 0) {
        n / 7
    } else {
        n / 7 + 1
    }
}

fun main(args: Array<String>) {
    var s = Solution()
    println(s.solution(15))
}