package Level3.N으로표현;

class Solution {
    int answer = -1;
    public int solution(int N, int number) {
        dfs(N, number, 0, 0);
        return answer;
    }

    public void dfs(int N, int number, int cnt, int sum) {
        if(cnt > 8) return;
        if(sum == number) {
            if(answer==-1) answer=cnt;
            else answer = Math.min(answer, cnt);
            return;
        }

        int tempN = N;
        for(int i = 0; i < 8 - cnt; i++) {
            dfs(N, number, cnt + i + 1, sum + tempN);
            dfs(N, number, cnt + i + 1, sum - tempN);
            dfs(N, number, cnt + i + 1, sum * tempN);
            dfs(N, number, cnt + i + 1, sum / tempN);

            tempN = tempN * 10 + N;
        }
    }
}

public class N으로표현 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(5, 12));
    }
}
