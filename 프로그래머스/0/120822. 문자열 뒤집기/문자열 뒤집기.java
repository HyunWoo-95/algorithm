import java.lang.StringBuilder;

class Solution {
    public String solution(String my_string) {
        // String answer = "";
        // char[] array = my_string.toCharArray();
        // for(int i = array.length-1; i>=0; i--){
        //     answer += array[i];
        // }
        // return answer;
        // 다른 코드
        StringBuilder sb = new StringBuilder(my_string);
        return sb.reverse().toString();
    }
}