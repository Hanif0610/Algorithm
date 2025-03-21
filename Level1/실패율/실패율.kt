package Level1.실패율

class Solution {
    fun solution(N: Int, stages: IntArray): IntArray {
        var person = stages.size
        var pair: HashMap<Int, Int> = hashMapOf()
        var answer: HashMap<Int, Double> = hashMapOf()

        stages.forEach { pair.merge(it, 1, Int::plus) }

        for(i in 1..N) {
            if(pair.containsKey(i)) {
                answer.merge(i, (if(pair.containsKey(i)) pair[i] else 0)!!.toDouble() / person, Double::plus)
                person -= pair[i]!!
            }
            else
                answer.merge(i, 0.0, Double::plus)
        }

        return answer.toSortedMap(compareByDescending { it }).keys.toIntArray()
    }
}

fun main() {
    println(Solution().solution(5, intArrayOf(2, 1, 2, 6, 2, 4, 3, 3)).contentToString())
}