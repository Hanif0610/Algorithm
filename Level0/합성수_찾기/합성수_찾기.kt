package Level0.합성수_찾기

class Solution {
    fun solution(n: Int): Int {
        var answer = 0
        for(i in 4..n) {
            for(j in 2..i-1) {
                if(i % j == 0)
                {
                    answer++
                    break
                }
            }
        }
        return answer
    }
}

fun main(args: Array<String>) {
    var solution = Solution()
    println(solution.solution(10))
}