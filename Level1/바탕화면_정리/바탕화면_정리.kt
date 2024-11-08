package Level1.바탕화면_정리

class Solution {
    fun solution(wallpaper: Array<String>): IntArray {
        var dict: MutableMap<Int, List<Int>> = mutableMapOf()
        var min: Int = 50
        var max: Int = 0
        for(i in 0 until wallpaper.count()) {
            var list = wallpaper[i].split("").withIndex().filter { it.value == "#" }.map { it.index - 1 }
            if(list.isNotEmpty()){
                dict[i] = list
                min = if(min > list.minOrNull()!!) list.minOrNull()!! else min
                max = if(max < list.maxOrNull()!!) list.maxOrNull()!! else max
            }
        }

        return intArrayOf(dict.keys.minOrNull()!!, min, dict.keys.maxOrNull()!! + 1, max + 1)
    }
}

fun main(args: Array<String>) {
    var solution = Solution()
    print(solution.solution(arrayOf("..", "#.")).contentToString())
}