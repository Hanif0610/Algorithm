package Level1.핸드폰번호가리기;

class Solution {
    public String solution(String phone_number) {
        String answer = "";
        for(int i = 0; i < phone_number.length()-4; i++) answer += "*";
        return answer += phone_number.substring(phone_number.length() - 4, phone_number.length());
    }
}

public class 핸드폰번호가리기 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution("01033334444"));
    }
}
