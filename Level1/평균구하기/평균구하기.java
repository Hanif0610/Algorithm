package Level1.평균구하기;

class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        for (int num : arr) {
            answer += num;
        }
        return answer/arr.length;
    }
}

public class 평균구하기 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {1,2,3,4};
        System.out.println(solution.solution(arr));
    }
}
