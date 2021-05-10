package Level2.위장;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        Map<String, Integer> map = new HashMap<>();
        for (String[] arr : clothes) {
            map.put(arr[1], map.getOrDefault(arr[1], 0) + 1);
        }

        Set<String> set = map.keySet();

        for (String key : set) {
            answer *= map.get(key) + 1;
        }

        return answer - 1;
    }
}

public class 위장 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[][] arr = {
                {"yellowhat", "headgear"},
                {"bluesunglasses", "eyewear"},
                {"green_turban", "headgear"}};

        System.out.println(solution.solution(arr));
    }
}
