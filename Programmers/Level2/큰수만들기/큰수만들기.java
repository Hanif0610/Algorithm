package Programmers.Level2.큰수만들기;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Solution {
    public String solution(String number, int k) {
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < number.length(); i++) {
            int num = Integer.parseInt(number.substring(i, i+1));
            while(!stack.isEmpty() && stack.peek() < num &&  k > 0) {
                stack.pop();
                k--;
            }
            stack.push(num);
        }

        while(0 != k) {
            stack.pop();
            k--;
        }

        List<Integer> list = new ArrayList<>(stack);
        return list.stream().map(Object::toString).reduce("", String::concat);
    }
}

public class 큰수만들기 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution("11119", 2));
    }
}
