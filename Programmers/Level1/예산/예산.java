package Programmers.Level1.예산;

import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        for(int i = 0; i < d.length; i++) {
            if(d[i] <= budget){
                budget -= d[i];
                answer++;
            }
        }
        return answer;
    }
}

public class 예산 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(new int[] { 1,3,2,5,4 }, 9));
    }
}
