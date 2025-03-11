package Programmers.Level2.하노이의_탑

class Solution {
    private var list: MutableList<IntArray> = mutableListOf()

    fun solution(n: Int): Array<IntArray> {
        hanoi(n, 1, 3, 2)
        return list.toTypedArray()
    }

    private fun hanoi(cnt: Int, start: Int, dist: Int, sub: Int) {
        if (cnt == 1) {
            list.add(intArrayOf(start, dist))
            return
        }

        hanoi(cnt - 1, start, sub, dist)
        list.add(intArrayOf(start, dist))
        hanoi(cnt - 1, sub, dist, start)
    }
}

fun main() {
    println(Solution().solution(3).contentToString())
}