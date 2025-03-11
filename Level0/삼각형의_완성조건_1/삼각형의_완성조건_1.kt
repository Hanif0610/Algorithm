package Level0.삼각형의_완성조건_1

class Solution {
    fun solution(sides: IntArray): Int {
        sides.sort()
        return if(sides[0] + sides[1] > sides[2]) 1 else 2
    }
//    fun solution(sides: IntArray) = sides.sorted().let { (x, y, z) -> if (x + y > z) 1 else 2 }
}

fun main() {
    println(Solution().solution(intArrayOf(3, 6, 2)))
}