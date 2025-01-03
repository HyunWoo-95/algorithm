class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int length = num_list.length;
        int idx = 1;
        if(length > 10){
            for(int num : num_list){
                answer += num;
            }
        }else if(length <= 10){
            for(int i = 0; i < length; i++){
             idx *= num_list[i];   
            }
            answer = idx;
        }
        return answer;
    }
}