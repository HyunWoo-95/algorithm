import java.util.stream.*;
class Solution {
    public int solution(int n) {
//        int answer = 0;
//            for (int i = 1; i<=n; i++){
//             if(i % 2 ==0){
//                 answer += i;
//             }
//         }
//         return answer;
        return IntStream.rangeClosed(0,n)
            .filter(value ->value % 2 ==0)
            .sum();   
    }
}