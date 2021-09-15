package Level1.시저암호;

class Solution {
    public String solution(String s, int n) {
        String answer = "";
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(s.charAt(i) == ' ') {
                answer += ' ';
                continue;
            }
            if(ch >= 65 && ch <= 90) {
                ch += n;
                if(ch > 90) ch -= 26;
            } else if(ch >= 97 && ch <= 122) {
                ch += n;
                if(ch > 122) ch -= 26;
            }
            answer += ch;
        }
        return answer;
    }
}

public class 시저암호 {
    public static void main(String[] args) {
        String s = "a B z";
        int n = 4;
        Solution solution = new Solution();
        System.out.println(solution.solution(s, n));
    }
}
