package Level1.year2016;

class Solution {
    public String solution(int a, int b) {
        String[] arr = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
        int[] month = {31,29,31,30,31,30,31,31,30,31,30,31};
        int day = 0;
        for(int i = 1; i <= a; i++) {
            for(int j = 1; j <= month[i-1]; j++) {
                day++;
                if(day%7 == 1) day%=7;
                if(i == a && j == b) break;
            }
        }
        return arr[day-1];
    }
}

public class year2016 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(5, 24));
    }
}
