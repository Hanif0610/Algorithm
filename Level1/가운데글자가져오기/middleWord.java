package Level1.가운데글자가져오기;

class Solution {
    public String solution(String s) {
        String answer = "";
        return answer = s.length() % 2 == 0 ? answer + s.substring(s.length()/2 - 1, s.length()/2 + 1)
                : answer + s.substring(s.length()/2, s.length()/2 + 1);
    }
}

public class middleWord {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution("qwer"));
    }
}
