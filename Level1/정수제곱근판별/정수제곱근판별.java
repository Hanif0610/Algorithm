package Level1.정수제곱근판별;

class Solution {
    public long solution(long n) {
        return Math.pow((int)Math.sqrt(n), 2) == n ? (long)Math.pow(Math.sqrt(n) + 1, 2) : -1;
    }
}

public class 정수제곱근판별 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(121));
    }
}
