package Programmers.Level2.최댓값과최솟값;

import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String[] arr = s.split(" ");
        int[] nArr = new int[arr.length];
        for(int i = 0; i < nArr.length; i++) {
            nArr[i] = Integer.parseInt(arr[i]);
        }
        Arrays.sort(nArr);

        return nArr[0] + " " + nArr[nArr.length - 1];
    }
}

public class 최댓값과최솟값 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution("-1 -2 -3 -4"));
    }
}
