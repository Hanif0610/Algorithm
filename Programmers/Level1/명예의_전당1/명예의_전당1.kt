package Programmers.Level1.명예의_전당1

class Solution {
    fun solution(k: Int, score: IntArray): IntArray {
        var scoreList = mutableListOf<Int>()
        var answer = mutableListOf<Int>()

        return run {
            score.forEach {
                scoreList.add(it)
                scoreList.sort()
                if(scoreList.size > k) {
                    scoreList.removeFirst()
                }
                answer.add(scoreList.first())
            }
            answer.toIntArray()
        }
    }
}

fun main(args: Array<String>) {
    var solution = Solution()
    print(solution.solution(3, intArrayOf(10, 100, 20, 150, 1, 100, 200)).contentToString())
}