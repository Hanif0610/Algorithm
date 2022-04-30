package Level1.문자열다루기기본

class Solution {
    fun solution(s: String): Boolean {
        if(s.length == 4 || s.length == 6) {
            return try {
                Integer.parseInt(s)
                true
            } catch (e: Exception) {
                false
            }
        }
        return false
    }
}

fun main(args: Array<String>) {
    val solution = Solution()
    println(solution.solution("1234"))
}