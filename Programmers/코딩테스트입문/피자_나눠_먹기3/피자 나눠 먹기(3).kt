package 코딩테스트입문.피자_나눠_먹기3

class Solution {
    fun solution(slice: Int, n: Int): Int = if(n % slice == 0)
        n / slice
    else
        n / slice + 1
}

fun main(args: Array<String>) {
    var s = Solution()
    println(s.solution(4, 12))
}