package Level1.부족한금액계산하기

class Solution {
    fun solution(price: Int, money: Int, count: Int): Long {
        var answer = (1 .. count).sumOf { x -> price.toLong() * x }
        return if(money - answer < 0) answer - money else 0
    }
    //(1..count).map { it * price.toLong() }.sum().let { if (money > it) 0 else it - money }
}

fun main(args: Array<String>) {
    var solution = Solution()
    print(solution.solution(3, 20, 4))
}