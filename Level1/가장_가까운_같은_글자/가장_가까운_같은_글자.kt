package Level1.가장_가까운_같은_글자

class Solution {
    fun solution(s: String): IntArray {
        var answer = mutableListOf<Int>()
        var used = mutableListOf<Char>()

        for(i in s.indices) {
            if(used.contains(s[i])) {
                answer.add(i - used.lastIndexOf(s[i]))
            } else {
                answer.add(-1)
            }
            used.add(s[i])
        }

        return answer.toIntArray()
    }
}

fun main(args: Array<String>) {
    var solution = Solution()
    print(solution.solution("foobar").contentToString())
}