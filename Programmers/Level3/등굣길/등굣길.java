package Programmers.Level3.등굣길;

class Solution {
    public int solution(int m, int n, int[][] puddles) {
        int[][] dp = new int[m+1][n+1];

        for (int[] puddle : puddles) {
            dp[puddle[0]][puddle[1]] = -1;
        }

        dp[0][1] = 1;
        for(int i = 1; i <= m; i++) {
            for(int j = 1; j <= n; j++) {
                dp[i][j] = dp[i][j] == -1 ? 0 : (dp[i-1][j] + dp[i][j-1]) % 1000000007;
            }
        }
        return dp[m][n];
    }
}

public class 등굣길 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] arr = {{2, 2}};
        System.out.println(solution.solution(4, 3, arr));
    }
}
