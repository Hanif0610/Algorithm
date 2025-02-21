package Programmers.Level1.최소직사각형

class Solution {
    fun solution(sizes: Array<IntArray>): Int {
        var array1 = ArrayList<Int>()
        var array2 = ArrayList<Int>()
        for (i in sizes){
            array1.add(Math.max(i[0], i[1]))
            array2.add(Math.min(i[0], i[1]))
        }
        array1.sort()
        array2.sort()
        return array1[sizes.size - 1] * array2[sizes.size - 1]
    }
}

fun main(args: Array<String>) {
    var solution = Solution()
    var array = arrayOf(intArrayOf(60, 50), intArrayOf(30, 70), intArrayOf(60, 30), intArrayOf(80, 40))
    print(solution.solution(array))
}