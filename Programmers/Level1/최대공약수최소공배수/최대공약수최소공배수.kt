package Programmers.Level1.최대공약수최소공배수

class Solution {
    fun gcd(a: Int, b: Int): Int = if(b != 0) gcd(b, a%b) else a

    fun solution(n: Int, m: Int): IntArray = intArrayOf(gcd(n, m), n * m / gcd(n, m))
}

fun main(args: Array<String>) {
    var solution = Solution()
    print(solution.solution(3, 12).contentToString())
}