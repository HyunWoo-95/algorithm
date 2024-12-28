class Solution {
    public int solution(int n) {
        int answer = 0;
        int pice = 7;
        if(n <= pice){
            answer = 1;
        } else if(n % pice == 0) {
            answer = n/pice;
        } else {
            answer = n/pice + 1;
        }
        
        return answer;
    }
}