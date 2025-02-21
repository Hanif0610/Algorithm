package Programmers.Level2.피보나치수;

class Solution {
    public int solution(int n) {
        int n1 = 0, n2 = 1;
        int answer = 0;
        for(int i = 2; i <= n; i++) {
            answer = n1%1234567 + n2%1234567;
            n1 = n2;
            n2 = answer;
        }
        return answer%1234567;
    }
}

public class 피보나치수 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(4));
    }
}
