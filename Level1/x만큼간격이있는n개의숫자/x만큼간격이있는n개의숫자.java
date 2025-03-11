package Level1.x만큼간격이있는n개의숫자;

import java.util.Arrays;

class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        for (int i = 0; i < n; i++) {
            answer[i] = (long) x * (i + 1);
        }
        return answer;
    }
}

public class x만큼간격이있는n개의숫자 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.solution(2, 5)));
    }
}
