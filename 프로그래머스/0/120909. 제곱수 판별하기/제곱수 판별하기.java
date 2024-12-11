class Solution {
    public int solution(int n) {
        int answer = 0;
        // 제곱수라면 1로 나누었을 떄 나머지가 남아서는 안된다(소수 자리가 남지 않는다.). 
        if(Math.sqrt(n)%1 == 0){
            answer = 1;
        }else {
            answer = 2;
        }
        return answer;
    }
}