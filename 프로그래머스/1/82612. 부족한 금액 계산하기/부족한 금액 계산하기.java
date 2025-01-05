class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long idx = 0;
        for(int i = 1; i <= count; i++){
            idx += (price * i); // 3 * 1, 3*2, 3*3 
        }
        answer = money >= idx ? 0 : idx - money;
        return answer;
    }
}