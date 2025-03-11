package Level0.짝수홀수개수

class Solution {
    fun solution(num_list: IntArray): IntArray {
        var array = intArrayOf(0, 0)
        num_list.forEach { x -> if(x % 2 == 0) array[0] += 1 else array[1]+= 1 }
        return array
    }
    //intArrayOf(numList.filter { it % 2 == 0 }.size, numList.filter { it % 2 == 1 }.size)
}

fun main() {
    var s = Solution()
    println(s.solution(intArrayOf(1, 2, 3, 4, 5)).contentToString())
}