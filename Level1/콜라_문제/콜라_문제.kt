package Level1.콜라_문제

class Solution {
    fun solution(a: Int, b: Int, n: Int): Int {
        var answer = 0
        var coke = n
        while (coke >= a) {
            var returnCount = coke / a * b
            answer += returnCount
            coke = returnCount + (coke % a)
        }
        return answer
    }
//    fun solution(a: Int, b: Int, n: Int): Int {
//        return (n - b) / (a - b) * b
//    }
}

fun main() {
    println(Solution().solution(3, 1, 20))
}