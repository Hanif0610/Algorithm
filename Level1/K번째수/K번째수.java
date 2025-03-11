//package Level1.K번째수;
//
//import java.util.*;
//
//class Solution {
//    public int[] solution(int[] array, int[][] commands) {
//        int[] answer = new int[commands.length];
//        List<Integer> arr = new ArrayList<>();
//        for(int i = 0; i < commands.length; i++) {
//            for(int j = commands[i][0]-1; j <= commands[i][1]-1; j++) {
//                arr.add(array[j]);
//            }
//            Collections.sort(arr);
//            answer[i] = arr.get(commands[i][2]-1);
//            arr.clear();
//        }
//        return answer;
//    }
//}
//
//public class K번째수 {
//    public static void main(String[] args) {
//        int[] arr = {1, 5, 2, 6, 3, 7, 4};
//        int[][] command = {{2,5,3},{4,4,1},{1,7,3}};
//        Solution solution = new Solution();
//        System.out.println(Arrays.toString(solution.solution(arr, command)));
//    }
//}
