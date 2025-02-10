package Level1.과일_장수

class Solution {
    fun solution(k: Int, m: Int, score: IntArray): Int {
        var answer: Int = 0
        score.sortDescending()
        var arr = score
        for (i in 0 until score.size step m) {
            if(i + m >= score.size) break
            var data = arr.slice(i until i+m)
            answer += data.last() * data.size
        }

        return answer
    }
}

fun main() {
    println(Solution().solution(3, 4, intArrayOf(1, 2, 3, 1, 2, 3, 1)))
}
