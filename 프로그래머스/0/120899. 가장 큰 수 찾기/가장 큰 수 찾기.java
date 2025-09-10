class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        int max_num = 0;
        int idx = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] > max_num){
                max_num = array[i];
                idx = i;
            }
        }
        answer[0] = max_num;
        answer[1] = idx;
        return answer;
    }
}