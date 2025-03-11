package Programmers.Level1.약수의개수와덧셈

class Solution {
    fun solution(left: Int, right: Int): Int {
        var answer: Int = 0
        for(i in left .. right) {
            var cnt = 0
            for(j in 1 .. i) {
                if(i % j == 0) cnt++
            }

            if(cnt % 2 == 0) answer += i
            else answer -= i
        }
        return answer
        //return (left..right).map { i -> if ((1..i).filter { i % it == 0 }.size % 2 == 0) i else -i }.sum()
    }
}

fun main(args: Array<String>) {
    var solution = Solution()
    print(solution.solution(13, 17))
}