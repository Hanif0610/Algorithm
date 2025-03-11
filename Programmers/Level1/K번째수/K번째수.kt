package Programmers.Level1.K번째수

class Solution {
    fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
        var answer = IntArray(commands.size)
        for(i in commands.indices) {
            var arr = array.sliceArray(commands[i][0]-1 until commands[i][1]).sorted()
            answer[i] = arr[commands[i][2]-1]
        }
        return answer
    }
}

fun main(args: Array<String>) {
    val solution = Solution()
    val array = intArrayOf(1, 5, 2, 6, 3, 7, 4)
    val commands = arrayOf(intArrayOf(2, 5, 3), intArrayOf(4, 4, 1), intArrayOf(1, 7, 3))
    println(solution.solution(array, commands).contentToString())
}