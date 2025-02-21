package 코딩테스트입문.연속된_수의_합

class Solution {
    fun solution(num: Int, total: Int): IntArray {
        var data: MutableList<Int> = mutableListOf(total / num)
        for (i in 1 until num) {
            if(i % 2 == 0)
                data.add(data.first() - 1)
            else
                data.add(data.last() + 1)

            data.sort()
        }
        return data.toIntArray().sortedArray()
    }
//    fun solution(num: Int, total: Int): IntArray =
//        (total / num - (num - 1) / 2).let { t -> IntArray(num) { index -> index + t } }
}

fun main() {
    println(Solution().solution(4, 14).contentToString())
}