package Level1.수박수박수박수박

class Solution {
    fun solution(n: Int): String {
        return (1..n).joinToString("") { i -> if (i % 2 != 0) "수" else "박" }
    }
}

fun main(args: Array<String>) {
    val solution = Solution()
    println(solution.solution(4))
}