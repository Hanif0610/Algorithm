package Level1.하샤드수;

class Solution {
    public boolean solution(int x) {
        int divide = x, sum = 0;
        while(x > 0) {
            sum += x % 10;
            x /= 10;
        }
        return divide % sum == 0;
    }
}

public class 하샤드수 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(10));
    }
}
