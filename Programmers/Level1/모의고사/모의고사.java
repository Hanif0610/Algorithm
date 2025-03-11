package Programmers.Level1.모의고사;

import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] answers) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {2,1,2,3,2,4,2,5};
        int[] arr3 = {3,3,1,1,2,2,4,4,5,5};
        int[] num = new int[3];
        for (int i = 0; i < answers.length; i++) {
            if (arr1[i%arr1.length] == answers[i]) num[0]++;
            if (arr2[i%arr2.length] == answers[i]) num[1]++;
            if (arr3[i%arr3.length] == answers[i]) num[2]++;
        }
        int max = Math.max(num[0], Math.max(num[1], num[2]));
        ArrayList<Integer> answer = new ArrayList<>();
        if(max == num[0]) answer.add(1);
        if(max == num[1]) answer.add(2);
        if(max == num[2]) answer.add(3);
        return answer.stream().mapToInt(i -> i).toArray();
    }
}

public class 모의고사 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {1,3,2,4,2};
        System.out.println(Arrays.toString(solution.solution(arr)));
    }
}
