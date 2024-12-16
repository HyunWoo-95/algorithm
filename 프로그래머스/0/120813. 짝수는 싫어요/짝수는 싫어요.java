import java.util.stream.IntStream;
class Solution {
    public int[] solution(int n) {
        // int[] answer;
        // if(n % 2 == 0){
        //     answer = new int[n/2];
        // }else {
        //     answer = new int[n/2 +1];
        // }
        // for(int i = 0; i < answer.length; i++){
        //         answer[i] = (i*2)+1;
        // }
        // return answer;
        return IntStream.rangeClosed(0,n).filter(value -> value % 2 == 1).toArray();
    }
}