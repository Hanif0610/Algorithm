package Level1.기사단원_무기

class Solution {
    fun solution(number: Int, limit: Int, power: Int): Int =
        (1 .. number).sumOf { i ->
            val count = (1 .. Math.sqrt(i.toDouble()).toInt()).sumOf { j ->
                when {
                    j * j == i -> 1
                    i % j == 0 -> 2
                    else -> 0
                }.toInt()
            }
            if(count > limit) power else count
        }
}

fun main() {
    println(Solution().solution(5, 3, 2))
}