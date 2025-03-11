package Level0.안전지대

class Solution {
    fun solution(board: Array<IntArray>): Int {
        var answer: Int = 0
        var list: MutableList<Pair<Int, Int>> = mutableListOf()
        board.forEachIndexed { i, row ->
            row.forEachIndexed { j, value ->
                if(value == 1) {
                    list.add(Pair(i, j))
                    answer++
                }
            }
        }

        list.forEach {
            for (i in it.first-1 .. it.first+1) {
                for (j in it.second-1 .. it.second+1) {
                    if(i in board.indices && j in board[i].indices && board[i][j] != 1){
                        board[i][j] = 1
                        answer++
                    }
                }
            }
        }

        return board.size * board[0].size - answer
    }
//    fun solution(board: Array<IntArray>): Int =
//        board.indices.map { row ->
//            board[row].indices.filter { board[row][it] == 1 }.forEach { col ->
//                ((row - 1).coerceAtLeast(0)..(row + 1).coerceAtMost(board.lastIndex)).map { row2 ->
//                    ((col - 1).coerceAtLeast(0)..(col + 1).coerceAtMost(board.first().lastIndex)).forEach { col2 ->
//                        if (board[row2][col2] == 0)
//                            board[row2][col2] = 2
//                    }
//                }
//            }
//        }.run { board.indices.map { board[it].count { value -> value == 0 } } }.sum()
}

fun main() {
    println(Solution().solution(arrayOf(intArrayOf(0, 0, 0, 0, 0),
        intArrayOf(0, 0, 0, 0, 0),
        intArrayOf(0, 0, 0, 0, 0),
        intArrayOf(0, 0, 1, 0, 0),
        intArrayOf(0, 0, 0, 0, 0))))
}