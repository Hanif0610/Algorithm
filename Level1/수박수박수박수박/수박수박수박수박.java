package Level1.수박수박수박수박;

class Solution {
    public String solution(int n) {
        StringBuilder answer = new StringBuilder();
        for(int i = 1; i <= n; i++)
            answer.append(i%2==0 ? "박" : "수");
        return answer.toString();
    }
}

public class 수박수박수박수박 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(5));
    }
}
