class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String num_str = num + "";
        String k_str = k + "";
        if(num_str.contains(k_str)){
            answer = num_str.indexOf(k_str) + 1;
        } else {
            answer = -1;
        }
        return answer;
    }
}