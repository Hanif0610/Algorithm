package Programmers.Level2.JadenCase;

import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String str = "";
        String[] arr = s.toLowerCase().split("\\s");
        for(int i = 0; i < arr.length; i++) {
            if(i == 0 && arr[i].equals("")) continue;
            if(i != 0 && arr[i].equals("")) {
                arr[i-1] +=  " ";
                continue;
            }
            arr[i] = " " + arr[i].substring(0, 1).toUpperCase().concat(arr[i].substring(1));
        }
        str = Arrays.stream(arr)
                .filter(i -> i != "")
                .reduce(((s1, s2) -> s1 + s2)).get();
        if(s.charAt(0) != ' ') str = str.substring(1);
        if(s.charAt(s.length()-1) == ' ') str = str.concat(" ");
        return str;
    }
}

public class JadenCase {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(" 3people  unFollowed me"));
    }
}
