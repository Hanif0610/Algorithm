package Level1.삼진법뒤집기;

class Solution {
    public int solution(int n) {
        String str = "";
        int answer = 0;
        for (int i = 0; n != 0; i++) {
            str += String.valueOf(n%3);
            n /= 3;
        }
        for(int i = str.length() - 1; i >= 0; i--) {
            answer += Integer.parseInt(str.substring(i, i+1)) * Math.pow(3, str.length() - i - 1);
        }
        return answer;
    }
}

public class 삼진법뒤집기 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(45));
    }
}
