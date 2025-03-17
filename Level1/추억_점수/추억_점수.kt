package Level1.추억_점수

class Solution {
    fun solution(name: Array<String>, yearning: IntArray, photo: Array<Array<String>>): IntArray {
        var answer: MutableList<Int> = mutableListOf()
        photo.forEach {
            answer.add(it.filter { name.contains(it) }.sumOf { yearning[name.indexOf(it)] })
        }

        return answer.toIntArray()
    }
//    fun solution(names: Array<String>, yearnings: IntArray, photoes: Array<Array<String>>): IntArray {
//        val map = names.zip(yearnings.toTypedArray()).toMap()
//        return photoes.map { photo -> photo.sumOf { map[it] ?: 0 } }.toIntArray()
//    }
}

fun main() {
    println(Solution().solution(arrayOf("may", "kein", "kain", "radi"), intArrayOf(5, 10, 1, 3), arrayOf(
        arrayOf("may", "kein", "kain", "radi"),
        arrayOf("may", "kein", "brin", "deny"),
        arrayOf("kon", "kain", "may", "coni"))).contentToString())
}