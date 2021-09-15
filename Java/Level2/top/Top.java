package Level2.top;

import java.util.Arrays;

class Solution {
    public int[] solution(int[] heights) {
        int[] answer = new int[heights.length];
        int high = heights[0], index = 0;
        answer[0] = 0;
        for(int i = 2; i <= heights.length; i++) {
            if(heights[i-2] > heights[i-1]) {
                high = heights[i-2];
                index = i-1;
            }
            if(heights[i-1] >= high) {
                answer[i-1] = 0;
            } else {
                answer[i-1] = index;
            }
        }
        return answer;
    }
}

public class Top {
    public static void main(String[] args) {
        int[] arr = {6,9,5,7,4};
        Solution solution = new Solution();
        int[] result = solution.solution(arr);
        System.out.println(Arrays.toString(result));
    }
}