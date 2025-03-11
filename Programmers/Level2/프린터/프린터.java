package Programmers.Level2.프린터;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(int[] priorities, int location) {
        List<Integer> list = new ArrayList<>();
        int answer = 0;

        for(int num : priorities) {
            list.add(num);
        }

        while (true) {
            int data = list.get(0);
            boolean flag = false;
            for(int i = data + 1; i <= 9; i++) {
                if(list.contains(i)) {
                    list.remove(0);
                    list.add(data);
                    flag = true;
                    break;
                }
            }
            if(!flag) {
                list.remove(0);
                answer++;
                if(location == 0) break;
            }
            location--;
            if(location < 0) location = list.size() - 1;
        }
        return answer;
    }
}

public class 프린터 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {1, 1, 9, 1, 1, 1};
        System.out.println(solution.solution(arr, 0));
    }
}
