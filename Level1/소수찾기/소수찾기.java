package Level1.소수찾기;

//에라토스테네스의 체 방식
class Solution {
    public int solution(int n) {
        int answer = 0;
        boolean[] sosu = new boolean [n+1];
        for(int i=2; i<=n ; i++) sosu[i]=true; //2~n번째수를 true로 초기화

        // 제곱근 구하기
        int root=(int)Math.sqrt(n);
        for(int i=2; i<=root; i++){ //2~루트n까지 검사
            if(sosu[i]){ //i번째의 수가 소수일 때
                for(int j=i; i*j<=n; j++) //그 배수들을 다 false로 초기화(배수는 소수가 아니기 때문)
                    sosu[i*j]=false;
            }
        } for(int i =2; i<=n; i++) {
            if(sosu[i]) //소수의 개수 세기
                answer++;
        } return answer;
    }
}


public class 소수찾기 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(10));
    }
}
