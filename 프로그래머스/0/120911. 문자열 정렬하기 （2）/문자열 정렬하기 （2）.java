import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] chars = my_string.toCharArray();
        for(int i = 0; i < chars.length; i++){
            chars[i] = Character.toLowerCase(chars[i]);   
        }
        Arrays.sort(chars);
        answer = String.valueOf(chars);
        return answer;
    }
}