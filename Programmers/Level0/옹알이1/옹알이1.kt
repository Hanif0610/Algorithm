package Programmers.Level0.옹알이1

class Solution {
    fun solution(babbling: Array<String>): Int {
        var answer: Int = 0
        var speak = mutableListOf("aya", "ye", "woo", "ma")
        babbling.forEach {
            var len = it.length
            for(i in speak.indices) {
                if(it.contains(speak[i])) {
                    len -= speak[i].length
                    if(len == 0) {
                        answer++
                        break
                    }
                }
            }
        }
        return answer
    }
// replace를 활용하여 해당 단어를 공백으로 만들고, length 또는 공백이면 count 추가하는 방법도 있다.
//    fun solution(babbling: Array<String>): Int {
//        val regex = "aya|ye|woo|ma".toRegex()
//        val answer: Int = babbling.map { it.replace(regex, "") }
//            .filter { it.length == 0 }
//            .count()
//        return answer
//    }
}

fun main(args: Array<String>) {
    var solution = Solution()
    print(solution.solution(arrayOf("ayaye", "uuuma", "ye", "yemawoo", "ayaa")))
}