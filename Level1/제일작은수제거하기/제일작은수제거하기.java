//package Level1.제일작은수제거하기;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//
//class Solution {
//    public int[] solution(int[] arr) {
//        if(arr.length <= 1) {
//            int[] answer = {-1};
//            return answer;
//        }
//        ArrayList<Integer> answer = new ArrayList();
//        int min = arr[0];
//        for (int j : arr) {
//            answer.add(j);
//            min = Math.min(j, min);
//        }
//        answer.remove((Integer) min);
//        return answer.stream().mapToInt(i -> i).toArray();
//    }
//}
//
//public class 제일작은수제거하기 {
//    public static void main(String[] args) {
//        Solution solution = new Solution();
//        int[] arr = {1,5,7,3,2,6};
//        System.out.println(Arrays.toString(solution.solution(arr)));
//    }
//}
