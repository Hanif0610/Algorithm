package Programmers.Level2.가장큰수;

import java.util.Arrays;

class Solution {
    public String solution(int[] numbers) {
        String[] strings = new String[numbers.length];
        String answer = "";
        for(int i = 0; i < strings.length; i++) {
            strings[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(strings, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));

        if(strings[0].equals("0")) return "0";

        for (String str : strings) {
            answer += str;
        }

        return answer;
    }
}

public class 가장큰수 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {3, 30, 34, 5, 9};
        System.out.println(solution.solution(arr));
    }
}
