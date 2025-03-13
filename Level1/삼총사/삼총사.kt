package Level1.삼총사

class Solution {
    fun solution(number: IntArray): Int {
        var triple: MutableList<Triple<Int, Int, Int>> = mutableListOf()
        for(i in 0 until  number.size - 2) {
            for(j in i + 1 until number.size - 1) {
                for (k in j + 1 until number.size) {
                    if (number[i] + number[j] + number[k] == 0)
                        triple.add(Triple(number[i], number[j], number[k]))
                }
            }
        }

        return triple.size
    }
//    var cnt = 0
//
//    fun solution(number: IntArray): Int {
//        dfs(0, 0, BooleanArray(number.size), number)
//        return cnt
//    }
//
//    fun dfs(depth: Int, idx: Int, visited: BooleanArray, number: IntArray) {
//        if(depth == 3) {
//            var sum = 0
//            visited.forEachIndexed { index, i -> if(i) sum += number[index] }
//            cnt += if(sum == 0) 1 else 0
//            return
//        }
//
//        for(i in idx until number.size) {
//            if(visited[i]) continue
//            visited[i] = true
//            dfs(depth + 1, i + 1, visited, number)
//            visited[i] = false
//        }
//    }
}

fun main() {
    println(Solution().solution(intArrayOf(-3, -2, -1, 0, 1, 2, 3)))
}