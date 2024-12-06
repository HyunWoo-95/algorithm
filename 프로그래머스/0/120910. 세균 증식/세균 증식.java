class Solution {
    public int solution(int n, int t) {
    //     int answer = 0;
    //     for(int i = 0; i < t; i++){
    //        n *=2;
    //     }
    //     answer = n;
    //     return answer;
    // }
        // Math.pow(base(밑),exponent(지수)) 해당 함수는 제곱근 함수로 (2의 10승)
        return n*(int)Math.pow(2,t);
        }
}