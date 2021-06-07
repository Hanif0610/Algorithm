package Level2.영어끝말잇기;

import java.util.Arrays;

class Solution {
    public int[] solution(int n, String[] words) {
        String[] str = new String[words.length];
        str[0] = words[0];
        for(int i = 1; i < words.length; i++) {
            if(!words[i].startsWith(str[i-1].substring(str[i-1].length()-1)) ||
                    Arrays.asList(str).contains(words[i])) {
                return new int[]{i%n+1, (i/n)+1};
            }
            str[i] = words[i];
        }

        return new int[]{0, 0};
    }
}

public class 영어끝말잇기 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] arr = {"hello", "one", "even", "never", "now", "world", "draw"};
        System.out.println(Arrays.toString(solution.solution(2, arr)));
    }
}
