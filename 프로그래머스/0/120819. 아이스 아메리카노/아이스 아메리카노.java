class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        int cost = 5500;
        answer[0] = money / cost;
        answer[1] = money - answer[0] * cost; 
        return answer;
    }
}