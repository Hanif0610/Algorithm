package Programmers.Level1.완주하지못한선수;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> list = new HashMap<>();
        for (String person : participant) {
            list.put(person, list.getOrDefault(person, 0) + 1);
        }
        for (String cm : completion) {
            list.put(cm, list.get(cm)-1);
        } 
        for (String key : list.keySet()) {
            if(list.get(key) != 0) {
                answer = key;
            }
        }

        return answer;
    }
}

public class 완주하지못한선수 {
    public static void main(String[] args) {
        String pm[] = new String[]{"leo", "kiki", "eden"};
        String cm[] = new String[]{"kiki", "eden"};

        Solution solution = new Solution();
        System.out.println(solution.solution(pm, cm));
    }
}
