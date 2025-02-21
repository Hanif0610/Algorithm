package Programmers.Level1.문자열내림차순으로배치하기;

import java.util.Arrays;
import java.util.Collections;

class Solution {
    public String solution(String s) {
        String[] str = s.split("");
        Arrays.sort(str, Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();
        for (String n : str) {
            sb.append(n);
        }
        return String.valueOf(sb);
    }
}

public class 문자열내림차순으로배치하기 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution("Zbcdefg"));
    }
}
