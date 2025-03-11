package Programmers.Level1.음양더하기

class Solution {
    fun solution(absolutes: IntArray, signs: BooleanArray): Int {
        var answer = 0
        for(i in 0 until absolutes.size) {
            answer = if(signs[i]) answer + absolutes[i]
            else answer - absolutes[i]
        }
        return answer
    }
}

fun main(args: Array<String>) {
    var solution = Solution()
    print(solution.solution(intArrayOf(4, 7, 12), booleanArrayOf(true, false, true)))
}