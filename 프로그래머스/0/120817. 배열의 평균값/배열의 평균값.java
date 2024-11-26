import java.util.stream.*;
import java.util.*;
class Solution {
    public double solution(int[] numbers) {
        // double answer = 0;
        // int sum = 0;
        // for(int i = 0; i < numbers.length; i++){
        //     sum += numbers[i];
        // }
        // answer = (double)sum / numbers.length;
        // return answer;
        
        // IntStream intStream = Arrays.stream(numbers);
        // return intStream.average().getAsDouble();
        return Arrays.stream(numbers).average().getAsDouble();
    }
}