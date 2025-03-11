package Level1.숫자문자열과영단어

class Solution {
    fun solution(s: String): Int {
        if(s.toIntOrNull() != null) return s.toInt()

        val data = mapOf("zero" to "0", "one" to "1", "two" to "2", "three" to "3", "four" to "4",
        "five" to "5", "six" to "6", "seven" to "7", "eight" to "8", "nine" to "9")

        var answer = ""
        var tmp = ""
        s.split("").forEach {
            if(it.toIntOrNull() != null) {
                answer += it
                return@forEach //continue
            }

            tmp += it
            if(data.containsKey(tmp)) {
                answer += data[tmp]
                tmp = ""
            }
        }
        return answer.toInt()
    }
    //fun solution(s: String): Int = s
    //        .replace("one", "1")
    //        .replace("two", "2")
    //        .replace("three", "3")
    //        .replace("four", "4")
    //        .replace("five", "5")
    //        .replace("six", "6")
    //        .replace("seven", "7")
    //        .replace("eight", "8")
    //        .replace("nine", "9")
    //        .replace("zero", "0")
    //        .toInt()
}

fun main(args: Array<String>) {
    var solution = Solution()
    println(solution.solution("123"))
}