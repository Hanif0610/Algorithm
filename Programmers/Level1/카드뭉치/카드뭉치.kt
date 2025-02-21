package Programmers.Level1.카드뭉치

class Solution {
    fun solution(cards1: Array<String>, cards2: Array<String>, goal: Array<String>): String {
        var cnt1 = 0
        var cnt2 = 0
        var answer: MutableList<String> = mutableListOf()
        for(i in 0 until  goal.size) {
            if(cards1.contains(goal[i])) {
                if(cards1[cnt1] == goal[i])
                    answer.add(goal[i])
                cnt1++
            }
            else if(cards2.contains(goal[i])){
                if(cards2[cnt2] == goal[i])
                    answer.add(goal[i])
                cnt2++
            }
        }
        return if(answer.toTypedArray().contentEquals(goal)) "Yes" else "No"
    }
//    fun solution(cards1: Array<String>, cards2: Array<String>, goal: Array<String>): String {
//        var idx1 = 0
//        var idx2 = 0
//
//        for(target in goal) {
//            if(idx1 < cards1.size && cards1[idx1] == target) idx1++
//            else if(idx2 < cards2.size && cards2[idx2] == target) idx2++
//            else return "No"
//        }
//
//        return "Yes"
//    }
}

fun main() {
    println(Solution().solution(arrayOf("i", "water", "drink"), arrayOf("want", "to"), arrayOf("i", "want", "to", "drink", "water")))
}