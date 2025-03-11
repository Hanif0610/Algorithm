package Programmers.Level1.나누어떨어지는배열;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> array = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
            if(arr[i]%divisor == 0) array.add(arr[i]);
        }
        if(array.isEmpty()) array.add(-1);
        Collections.sort(array);
        int[] answer = new int[array.size()];
        for(int i = 0; i < array.size(); i++) {
            answer[i] = array.get(i);
        }
        return answer;
    }
}

public class 나누어떨어지는배열 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {5, 9, 7, 10};
        int num = 5;
        System.out.println(Arrays.toString(solution.solution(arr, num)));
    }
}
