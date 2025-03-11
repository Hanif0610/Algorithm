package Level0.배열원소의길이

class Solution {
    fun solution(strlist: Array<String>): IntArray = strlist.map { x -> x.length }.toIntArray()
}

fun main() {
    var s = Solution()
    println(s.solution(arrayOf<String>("We", "Are", "Programmers.")).contentToString())
}