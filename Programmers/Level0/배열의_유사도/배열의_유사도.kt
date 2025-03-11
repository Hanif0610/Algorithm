package Programmers.Level0.배열의_유사도

class Solution {
    fun solution(s1: Array<String>, s2: Array<String>): Int = s1.count { s2.contains(it) }
}

fun main() {
    println(Solution().solution(arrayOf("a", "b", "c"), arrayOf("com", "b", "d", "p", "c")))
}