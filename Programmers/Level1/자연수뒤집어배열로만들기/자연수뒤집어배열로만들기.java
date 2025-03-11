//package Programmers.Level1.자연수뒤집어배열로만들기;
//
//import java.util.Arrays;
//
//class Solution {
//    public int[] solution(long n) {
//        String str = String.valueOf(n);
//        int[] answer = new int[str.length()];
//        for(int i = 1; i <= str.length(); i++) {
//            answer[i-1] = Integer.parseInt(str.substring(str.length() - i, str.length() - i + 1));
//        }
//        return answer;
//    }
//}
//
//public class 자연수뒤집어배열로만들기 {
//    public static void main(String[] args) {
//        Solution solution = new Solution();
//        System.out.println(Arrays.toString(solution.solution(12345)));
//    }
//}
