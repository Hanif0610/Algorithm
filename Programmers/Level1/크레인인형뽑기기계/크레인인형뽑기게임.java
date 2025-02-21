package Programmers.Level1.크레인인형뽑기기계;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0, index = 0;
        int[] arr = new int[moves.length];
        for(int i = 0; i < moves.length; i++) {
            for(int j = 0; j < board.length; j++) {
                if(board[j][moves[i]-1] != 0) {
                    arr[index] = board[j][moves[i]-1];
                    board[j][moves[i]-1] = 0;
                    index++;
                    break;
                }
            }

            if(index > 1 && arr[index - 1] == arr[index - 2]) {
                arr[index-1] = 0;
                arr[index-2] = 0;
                answer += 2;
                index -= 2;
            }
        }
        return answer;
    }
}

public class 크레인인형뽑기게임 {
    public static void main(String[] args) {
        int[][] arr = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        int[] move = {1,5,3,5,1,2,1,4};
        Solution solution = new Solution();
        System.out.println(solution.solution(arr, move));
    }
}
