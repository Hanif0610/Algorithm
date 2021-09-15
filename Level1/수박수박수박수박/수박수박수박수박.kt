package Level1.수박수박수박수박

class Solution {
    fun solution(n: Int): String {
        var answer = ""
        for(i in 1 .. n) {
            answer += if(i % 2 != 0) "수" else "박"
        }
        return answer
    }
}

fun main(args: Array<String>) {
    val solution = Solution()
    println(solution.solution(4))
}