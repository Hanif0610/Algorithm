package Programmers.Level1.소수_만들기

class Solution {
    fun solution(nums: IntArray): Int {
        var answer = mutableListOf<Int>()
        var returnData = mutableListOf<Int>()

        for(i in 0 until nums.size - 2) {
            for(j in i + 1 until nums.size - 1) {
                for(k in j + 1 until nums.size) {
                    answer.add(nums[i] + nums[j] + nums[k])
                }
            }
        }

        answer.forEach {
            var flag = true
            for(i in 2..Math.sqrt(it.toDouble()).toInt() + 1){
                if(it % i == 0){
                    flag = false
                    break
                }
            }
            if(flag) 
                returnData.add(it)
        }

        return returnData.size
    }
}

fun main() {
    println(Solution().solution(intArrayOf(1, 2, 3, 4)))
}