import java.util.*;

public class Solution {
    public int solution(int n) {
        /**
         *N이 500일 때
         - 500-> 25-> 125(ans + 1)-> 62-> 31(ans + 1)-> 15(ans + 1)-> 7(ans + 1)-> 3(ans + 1)-> 1(ans + 1)              - 따라서 건전지 사용량은 6이 된다.
         - n / 2가 홀수일 때만 ans에 1을 더해준다.
         - 이 과정을 n > 0이 될 때까지 반복한다.
        */

//         int ans = 0;
//         while(n >0){
//             if(n % 2== 1){
//             ans+=1;
//             }
//               n/=2;
//         }

//         return ans;
        return Integer.bitCount(n);
    }
}