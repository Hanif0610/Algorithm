package Programmers.Level1.성격_유형_검사하기

class Solution {
    fun solution(survey: Array<String>, choices: IntArray): String {
        var type: Map<String, MutableMap<String, Int>> = mapOf(
            "RT" to mutableMapOf("R" to 0, "T" to 0),
            "CF" to mutableMapOf("C" to 0, "F" to 0),
            "JM" to mutableMapOf("J" to 0, "M" to 0),
            "AN" to mutableMapOf("A" to 0, "N" to 0))

        for(i in 0 until survey.size) {
            var flag = true
            var key = survey[i]
            val code = key.map { it.code }
            if(code[0] > code[1]) {
                key = survey[i].toCharArray().sorted().joinToString("")
                flag = false
            }

            if(flag) {
                if (choices[i] - 4 > 0)
                    type[key]!![key.get(1).toString()] = type[key]!![key.get(1).toString()]!! + (choices[i] - 4)
                else
                    type[key]!![key.get(0).toString()] = type[key]!![key.get(0).toString()]!! + ((choices[i] - 4) * -1)
            } else {
                if (choices[i] - 4 > 0)
                    type[key]!![key.get(0).toString()] = type[key]!![key.get(0).toString()]!! + (choices[i] - 4)
                else
                    type[key]!![key.get(1).toString()] = type[key]!![key.get(1).toString()]!! + ((choices[i] - 4) * -1)
            }
        }

        var answer = ""
        type.values.forEach {
            var values = it.values
            answer += if(values.first() >= values.last())
                it.keys.first()
            else
                it.keys.last()
        }

        return answer
    }
}

fun main() {
    println(Solution().solution(arrayOf("AN", "CF", "MJ", "RT", "NA"), intArrayOf(5, 3, 2, 7, 5)))
}