package Level0.저주의_숫자_3

class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 0
        for(i in 1 .. n) {
            answer++;

            while (answer % 3 == 0 || answer.toString().contains('3'))
                answer++
        }
        return answer;
    }
}

fun main() {
    var s = Solution()
    println(s.solution(40))
}