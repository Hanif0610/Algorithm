package Level0.배열자르기

class Solution {
    fun solution(numbers: IntArray, num1: Int, num2: Int): IntArray = numbers.slice(num1..num2).toIntArray()
}

fun main(args: Array<String>) {
    println("Hello, World!")
    var s = Solution()
    println(s.solution(intArrayOf(1, 2, 3, 4, 5), 1, 3).contentToString())
}
