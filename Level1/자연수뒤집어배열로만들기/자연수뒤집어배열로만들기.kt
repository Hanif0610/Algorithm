package Level1.자연수뒤집어배열로만들기

class Solution {
    fun solution(n: Long): IntArray {
        return n.toString().reversed().map { it.toString().toInt() }.toIntArray()
    }
}

fun main(args: Array<String>) {
    val solution = Solution()
    println(solution.solution(12345).contentToString())
}