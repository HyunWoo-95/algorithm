class Solution {
    public int solution(int num1, int num2) {
     // 형변환 사용 Int -> double -> int 순서
        // 정수형으로 계산 시 맞아떨어지지 않는 계산은 소수점 기준으로 절삭된다.
        // int answer =  0;
        // double res = (double) num1 / num2 * 1000;
        // answer = (int) res;
        // return answer;
        // return num1 * 1000 / num2;
        return num1 * 1000 / num2;
    }
}