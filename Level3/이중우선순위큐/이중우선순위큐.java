package Level3.이중우선순위큐;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Solution {
    public int[] solution(String[] operations) {
        int[] answer = new int[2];
        List<Integer> list = new ArrayList<>();
        for (String operation : operations) {
            String[] arr = operation.split("\\s");
            if(arr[0].equals("I")) {
                list.add(Integer.parseInt(arr[1]));
            } else {
                if(list.size() == 0) continue;
                Collections.sort(list);
                if(arr[1].equals("1")) {
                    list.remove(list.size()-1);
                } else {
                    list.remove(0);
                }
            }
        }
        Collections.sort(list);
        answer[0] = list.size() == 0 ? 0 : list.get(list.size()-1);
        answer[1] = list.size() == 0 ? 0 : list.get(0);
        return answer;
    }
}

public class 이중우선순위큐 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] arr = {"I 16","D 1"};
        System.out.println(Arrays.toString(solution.solution(arr)));
    }
}
