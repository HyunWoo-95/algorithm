import java.util.*;
class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        // 내 코드
        // int[] answer = new int[num2-num1+1];
        // int idx = 0;
        // for(int i = 0; i < numbers.length; i++){
        //         if(i >= num1 && i <= num2){
        //             answer[idx++] = numbers[i]; 
        //         }
        // }
        // return answer;
        
        // 스트림 코드
        return Arrays.copyOfRange(numbers, num1, num2+1);
    }
}