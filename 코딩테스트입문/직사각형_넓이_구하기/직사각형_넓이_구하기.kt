package 코딩테스트입문.직사각형_넓이_구하기

class Solution {
    fun solution(dots: Array<IntArray>): Int {
        var x = intArrayOf(256, -256)
        var y = intArrayOf(256, -256)
        dots.forEach { arr ->
            x[0] = Math.min(x[0], arr[0])
            x[1] = Math.max(x[1], arr[0])
            y[0] = Math.min(y[0], arr[1])
            y[1] = Math.max(y[1], arr[1])
        }

        return (x[1] - x[0]) * (y[1] - y[0])
    }

//    fun solution(dots: Array<IntArray>): Int {
//        val coordX = dots.map { it[0] }.toSortedSet()
//        val coordY = dots.map { it[1] }.toSortedSet()
//
//        return (coordX.last() - coordX.first()) * (coordY.last() - coordY.first())
//    }
}

fun main() {
    println(Solution().solution(arrayOf(intArrayOf(1, 1), intArrayOf(2, 1), intArrayOf(2, 2), intArrayOf(1, 2))))
}