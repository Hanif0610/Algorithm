package Level1.없는숫자더하기

class Solution {
    fun solution(numbers: IntArray): Int {
        var answer: Int = 45
        for(i in numbers)
            answer -= i
        return answer
    }
}
//fun solution(numbers: IntArray): Int = (0..9).filterNot(numbers::contains).sum()

fun main(args: Array<String>) {
    var solution = Solution()
    print(solution.solution(intArrayOf(1,2,3,4,6,7,8,0)))
}