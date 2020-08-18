package Level1.문자열내p와y의개수;

class Solution {
    boolean solution(String s) {
        int pNum = 0, yNum = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'p' || s.charAt(i) == 'P') pNum++;
            else if(s.charAt(i) == 'y' || s.charAt(i) == 'Y') yNum++;
        }

        return pNum == yNum;
    }
}

public class 문자열내p와y의개수 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution("PYpypypyPY"));
    }
}
