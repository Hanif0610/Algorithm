package 연습문제.과일_장수

class Solution {
    fun solution(k: Int, m: Int, score: IntArray): Int {
        var answer: Int = 0
        score.sortDescending()
        for (i in 0 until score.size step m) {
            if(i + m > score.size) break
            var data = score.slice(i until i+m)
            answer += data.last() * data.size
        }

        return answer
    }
//    fun solution(k: Int, m: Int, score: IntArray): Int {
//        var answer: Int = 0
//        score.sortDescending()
//        var num =0
//        score.forEach{
//            num+=1
//            if(num%m == 0){
//                answer+= it*m
//            }
//        }
//        return answer
//    }
}

fun main() {
    println(Solution().solution(5, 5, intArrayOf(1, 1, 1, 1, 1, 1, 1, 2, 2, 2)))
}
