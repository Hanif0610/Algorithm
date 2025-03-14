package Level1.푸드_파이트_대회

class Solution {
    fun solution(food: IntArray): String {
        var answer = ""
        for (i in 1 until food.size) {
            repeat(food[i] / 2) { answer += i }
        }
        return answer + "0" + answer.reversed()
    }
}

fun main() {
    println(Solution().solution(intArrayOf(1, 7, 1, 2)))
}