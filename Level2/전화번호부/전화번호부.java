package Level2.전화번호부;

import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        Map<String, Integer> map = new LinkedHashMap<>();
        int cnt = 0;
        for (String string : phone_book) {
            map.put(string, cnt++);
        }

        Iterator<String> keys = map.keySet().iterator();
        for (int i = 1; i < map.size(); i++) {
            String key = keys.next();
            for (int j = i; j < map.size(); j++) {
                if (getKey(map, j).startsWith(key)) {
                    answer = false;
                    break;
                }
            }
            if (!answer) break;
        }
        return answer;
    }

    public static <K, V> K getKey(Map<K, V> map, V value) {
        for (K key : map.keySet()) {
            if (value.equals(map.get(key))) {
                return key;
            }
        }
        return null;
    }
}

public class 전화번호부 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String str[] = new String[]{"119", "97674223", "1195524421"};
        System.out.println(solution.solution(str));
    }
}
