package Programmers.Level1.크기가_작은_부분_문자열

class Solution {
    fun solution(t: String, p: String): Int {
        var cnt: Int = 0
        for(i in 0 until t.length - p.length + 1) {
            var split = t.substring(i, p.length+i)
            if(split.toLong() <= p.toLong())
                cnt += 1
        }

        return cnt
    }
}

fun main(args: Array<String>) {
    var solution = Solution()
    var t = "199"
    var p = "2"
    print(solution.solution(t, p))
}