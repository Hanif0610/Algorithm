package Programmers.Level1.이상한문자만들기;

class Solution {
    public String solution(String s) {
        String answer = new String();
        int count = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' ') {
                answer += ' ';
                count = 0;
            } else {
                answer += count % 2 == 0 ? s.toUpperCase().charAt(i) : s.toLowerCase().charAt(i);
                count++;
            }
        }
        return answer;
    }
}

public class 이상한문자만들기 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution("try hello world"));
    }
}
