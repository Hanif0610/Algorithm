package Programmers.Level2.전화번호부;

import java.util.Arrays;

class Solution {
    public boolean solution(String[] phone_book) {
        Arrays.sort(phone_book);

        for(int i = 0; i < phone_book.length - 1; i++) {
            if(phone_book[i+1].startsWith(phone_book[i])) {
                return false;
            }
        }
        
        return true;
    }
}

public class 전화번호부 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String str[] = new String[]{"119", "97674223", "1195524421"};
        System.out.println(solution.solution(str));
    }
}
