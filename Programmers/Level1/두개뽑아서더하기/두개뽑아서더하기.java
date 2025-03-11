package Programmers.Level1.두개뽑아서더하기;

import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> answer = new HashSet<>();
        for (int i = numbers.length - 1; i >= 0 ; i--) {
            for(int j = 0; j < i; j++) {
                answer.add(numbers[i] + numbers[j]);
            }
        }
        return answer.stream().mapToInt(i -> i).sorted().toArray();
    }
}

public class 두개뽑아서더하기 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {2,1,3,4,1};
        System.out.println(Arrays.toString(solution.solution(arr)));
    }
}
