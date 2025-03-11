package Programmers.Level2.더맵게;

import java.util.PriorityQueue;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer, cnt = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int j : scoville) {
            queue.add(j);
        }
        while (true) {
            if(queue.size() == 1 && queue.peek() < K) {
                answer = -1;
                break;
            }
            if(queue.peek() < K) {
                int num = queue.poll() + (queue.poll() * 2);
                queue.add(num);
            } else {
                answer = cnt;
                break;
            }
            cnt++;
        }
        return answer;
    }
}

public class 더맵게 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {1, 2, 3, 9, 10, 12};
        System.out.println(solution.solution(arr, 7));
    }
}
