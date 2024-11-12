import java.util.Arrays;

class Solution {
    public int solution(int n) {
//         String[] arr = String.valueOf(n).split("");
//         return Arrays.stream(arr).mapToInt(Integer::parseInt).sum();
        int answer = 0;
        String[] s = String.valueOf(n).split("");
        for(int i = 0; i < s.length; i++){
            answer += Integer.parseInt(s[i]);
        }
        return answer; 
    }
}