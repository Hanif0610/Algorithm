package Level0.점의위치구하기

class Solution {
    fun solution(dot: IntArray): Int =
        if(dot[0] > 0)
            if(dot[1] > 0)
                1
            else
                4
        else
            if(dot[1] > 0)
                2
            else
                3
}

fun main() {
    var s = Solution()
    println(s.solution(intArrayOf(-7, 9)))
}