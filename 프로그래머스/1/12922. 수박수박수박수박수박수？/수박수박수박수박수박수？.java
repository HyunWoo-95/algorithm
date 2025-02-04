class Solution {
    public String solution(int n) {
        String answer = "";
        String word = "수박";
        if(n % 2 == 0){
            answer = word.repeat(n/2);
        } else{
            answer = word.repeat((n-1)/2) + "수";
        }
        return answer;
    }
}