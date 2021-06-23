package Level2.이진변환반복하기;

import java.util.Arrays;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        for(int i = 1; !s.equals("1"); i++) {
            String str = s.replace("0", "");
            answer[0] = i;
            answer[1] += (s.length() - str.length());
            s = Integer.toBinaryString(str.length());
        }
        return answer;
    }
}

public class 이진변환반복하기 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.solution("110010101001")));
    }
}