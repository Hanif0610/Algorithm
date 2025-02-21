package Programmers.Level2.최솟값만들기;

import java.util.Arrays;

class Solution {
    public int solution(int []A, int []B) {
        int answer = 0;

        Arrays.sort(A);
        Arrays.sort(B);
        for(int i = 1; i <= A.length; i++) {
            answer = answer + (A[i-1] * B[A.length - i]);
        }
        return answer;
    }
}

public class 최솟값만들기 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {1, 4, 2};
        int[] arr2 = {5, 4, 4};
        System.out.println(solution.solution(arr, arr2));
    }
}
