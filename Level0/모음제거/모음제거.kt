package Level0.모음제거

class Solution {
    fun solution(my_string: String): String = my_string.toCharArray()
        .filter { x -> Regex("[^aeiou]").matches(x.toString()) }
        .joinToString("")
    //my_string.replace("[aeiou]".toRegex(), "")
}

fun main() {
    var s = Solution()
    println(s.solution("abc"))
}