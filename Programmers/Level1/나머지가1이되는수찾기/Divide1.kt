package Programmers.Level1.나머지가1이되는수찾기

class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 0
        for(i in 3 .. n) {
            if(n % i == 1) {
                answer = i
                break
            }
        }
        return answer
    }
}

fun main(args: Array<String>) {
    val solution = Solution()
    println(solution.solution(10))
}