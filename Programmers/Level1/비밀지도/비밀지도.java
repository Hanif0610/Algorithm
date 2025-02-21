package Programmers.Level1.비밀지도;

import java.util.Arrays;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for(int i = 0; i < n; i++) {
            String str1 = Integer.toBinaryString(arr1[i]);
            String str2 = Integer.toBinaryString(arr2[i]);
            if(str1.length() != n) {
                String str = "";
                for(int j = 0; j < (n - str1.length()); j++) {
                    str += "0";
                }
                str1 = str + str1;
            }
            if(str2.length() != n) {
                String str = "";
                for(int j = 0; j < (n - str2.length()); j++) {
                    str += "0";
                }
                str2 = str + str2;
            }

            String addStr = "";
            for(int j = 0; j < n; j++) {
                addStr += (str1.charAt(j) == '1' || str2.charAt(j) == '1') ? "#" : " ";
            }
            answer[i] = addStr;
        }
        return answer;
    }
}

public class 비밀지도 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr1 = {9, 20, 28, 18, 11}, arr2 = {30, 1, 21, 17, 28};
        System.out.println(Arrays.toString(solution.solution(5, arr1, arr2)));
    }
}
