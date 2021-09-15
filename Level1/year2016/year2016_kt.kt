package Level1.year2016

class Solution {
    fun solution(a: Int, b: Int): String {
        var month = arrayOf(31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
        var date = arrayOf("FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU")
        var day = 0
        for(i in 0 until a-1) {
            day += month[i]
        }
        return date[(day + b - 1)%7]
    }
}

fun main(args: Array<String>) {
    val solution = Solution()
    println(solution.solution(5, 24))
}