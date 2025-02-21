package Programmers.Level1.정수내림차순배치;

class Solution {
    public long solution(long n) {
        String str = String.valueOf(n);
        int[] arr = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = Integer.parseInt(str.substring(i, i+1));
        }
        for(int i = arr.length-1; i > 0; i--) {
            for(int j = 0; j < i; j++) {
                if(arr[j] < arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        StringBuilder s_answer = new StringBuilder();
        for (int j : arr) {
            s_answer.append(Integer.toString(j));
        }
        return Long.parseLong(s_answer.toString());
    }
}

public class 정수내림차순배치 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(118372));
    }
}
