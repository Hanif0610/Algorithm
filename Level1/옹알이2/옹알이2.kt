package Level1.옹알이2

class Solution {
    fun solution(babbling: Array<String>): Int {
        var answer: Int = 0
        var wordArray = arrayOf("aya", "ye", "woo", "ma")

        babbling.forEach {
            var word = it
            var last = ""
            while (true) {
                var startWith = wordArray.firstOrNull { word.startsWith(it) }
                if(null == startWith || startWith == last)
                    break

                word = word.takeIf { startWith.length in it.indices }?.substring(startWith.length) ?: ""
                last = startWith
            }

            if(word == "")
                answer++
        }

        return answer
    }
//    fun solution(babbling: Array<String>): Int {
//        val regex = "aya|ye|woo|ma".toRegex()
//        val regexC = "ayaaya|yeye|woowoo|mama".toRegex()
//
//        return babbling.filter { !it.contains(regexC) }
//            .map { it.replace(regex, "") }
//            .count { it.isEmpty() }
//    }
}

fun main() {
    println(Solution().solution(arrayOf("ayaye", "uuu", "yeye", "yemawoo", "ayaayaa")))
}