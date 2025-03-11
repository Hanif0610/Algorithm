package Programmers.Level1.평균구하기;

import java.util.Arrays;

class Solution {
    public double solution(int[] arr) {
        return Arrays.stream(arr).average().orElse(0);
    }
}

public class 평균구하기 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {1,2,3,4};
        System.out.println(solution.solution(arr));
    }
}
