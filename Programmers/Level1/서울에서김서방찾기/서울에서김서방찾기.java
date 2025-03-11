package Programmers.Level1.서울에서김서방찾기;

import java.util.Arrays;

class Solution {
    public String solution(String[] seoul) {
        return "김서방은 " + Arrays.asList(seoul).indexOf("Kim") + "에 있다";
    }
}

public class 서울에서김서방찾기 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] arr = {"Jane", "Kim"};
        System.out.println(solution.solution(arr));
    }
}
