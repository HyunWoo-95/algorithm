import java.util.*;
class Solution {
    public long solution(long n) {
        long answer = 0;
        String[] strList = String.valueOf(n).split("");
        Arrays.sort(strList);
        
        StringBuilder sb = new StringBuilder();
        for(String str : strList) {
            sb.append(str);
        }
        return Long.parseLong(sb.reverse().toString());
        
        //분할
//         String str = "" + n;
//         Integer[] arr = new Integer[str.length()];
        
//         for(int i = 0; i<str.length(); i++){
//             arr[i] = Integer.parseInt(str.substring(i, i+1));
//         }
            //정렬    
            // Arrays.sort(arr);
            //     //조합
            //    for(int i = 0; i<str.length(); i++ ){
            //        answer += arr[i] * Math.pow(10,i);
            //    } 
            //     return answer;  
        // long으로 입력된 숫자를 String로 변환 후 한글자씩 분할하여 형 변환하여 배열에 담는다.
        //오름 차순으로 정렬한다
        // 각 배열 *10의 제곱을 구하여 answer에 더해준다 

    }
}