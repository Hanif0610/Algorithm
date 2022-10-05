package Level1.문자열내마음대로정렬하기

class Solution {
    fun solution(strings: Array<String>, n: Int): Array<String> {
        for(i in 0 until strings.size - 1) {
            for(j in i + 1 until strings.size) {
                var str1 = strings[i].substring(n, n + 1)
                var str2 = strings[j].substring(n, n + 1)
                if(str1 >= str2) {
                    if(str1 == str2 && strings[i].compareTo(strings[j]) < 0) continue
                    var temp = strings[j]
                    strings[j] = strings[i]
                    strings[i] = temp
                }
            }
        }
        return strings
        // var list =  strings.sortedWith(compareBy({ it[n] }, { it }))
        //        return list.toTypedArray()
    }
}

fun main(args: Array<String>) {
    var solution = Solution()
    var arr = arrayOf("abce", "abcd", "cdx")
    print(solution.solution(arr, 2).contentToString())
}