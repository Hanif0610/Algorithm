package Level1.같은숫자는싫어;

import java.util.*;

class Solution {
    public int[] solution(int []arr) {

        int last = 10, num = 10;

        List<Integer> list = new ArrayList<>();
        for (int nNum: arr) {
            if(last != nNum && !(nNum >= num)) {
                list.add(nNum);
                last = nNum;
            }
        }

        int[] answer = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}

public class NoSameNumber {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {4,4,4,10,3,3};
        System.out.println(Arrays.toString(solution.solution(arr)));
    }
}
