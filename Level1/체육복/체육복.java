package Level1.체육복;

import java.util.Arrays;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        n -= lost.length;
        Arrays.sort(lost);
        Arrays.sort(reserve);
        for(int i = 0; i < lost.length; i++) {
            for(int j = 0; j < reserve.length; j++) {
                if (lost[i] == reserve[j]) {
                    lost[i] = 0;
                    reserve[j] = 0;
                    n++;
                    break;
                }
            }
        }

        for(int i = 0; i < lost.length; i++) {
            for(int j = 0; j < reserve.length; j++) {
                if (reserve[j] != 0) {
                    if(lost[i] == reserve[j] + 1 || lost[i] == reserve[j] - 1) {
                        reserve[j] = 0;
                        n++;
                        break;
                    }
                }
            }
        }
        return n;
    }
}

public class 체육복 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 5;
        int[] lost = {2, 4};
        int[] reserve = {1, 3, 5};
        System.out.println(solution.solution(n, lost, reserve));
    }
}
