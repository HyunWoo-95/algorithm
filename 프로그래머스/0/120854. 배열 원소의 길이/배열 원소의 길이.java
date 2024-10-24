import java.util.Arrays;

class Solution {
    public int[] solution(String[] strlist) {
        // 내 코드
//         int[] answer = new int[strlist.length];
        
//         for(int i = 0; i < answer.length; i++){
//             int a = strlist[i].length();
//             answer[i] = a;
//         }
        
//         return answer;
        // 스트림 코드
        return Arrays.stream(strlist).mapToInt(String::length).toArray();
    }
}