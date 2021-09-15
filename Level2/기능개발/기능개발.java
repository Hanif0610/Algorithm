package Level2.기능개발;

import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> arr = new ArrayList<>();
        int num = 0;
        boolean bk = true;
        while (bk){
            for(int i = 0; i < progresses.length; i++) {
                if(i == 0) {
                    if(progresses[i] >= 100) {
                        num++;
                        progresses[i] = 0;
                        speeds[i] = 0;
                    }
                } else {
                    if(progresses[i] >= 100) {
                        if(progresses[i-1] == 0) {
                            num++;
                            progresses[i] = 0;
                            speeds[i] = 0;
                        }
                    }
                }
                progresses[i] += speeds[i];
                if(progresses[progresses.length-1] == 0) bk = false;
            }
            if(num != 0) {
                arr.add(num);
                num = 0;
            }
        }
        int[] answer = new int[arr.size()];
        for(int i = 0; i < arr.size(); i++) {
            answer[i] = arr.get(i);
        }
        return answer;
    }
}

public class 기능개발 {
    public static void main(String[] args) {
        int[] progress = {93,30,55};
        int[] speeds = {1,30,5};
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.solution(progress, speeds)));
    }
}
