import java.util.*;
class Solution {
    public String solution(String my_string) {
        // String answer = "";
        // for(int i = 0; i < my_string.length(); i++){
        //     char c= my_string.charAt(i);
        //     if(Character.isLowerCase(c)){
        //         answer += (char)(c-32);
        //     }else{
        //         answer += (char)(c+32);
        //     }
        // }
        // return answer;
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < my_string.length(); i++){
            char c = my_string.charAt(i);
            if(Character.isLowerCase(c)){
                sb.append(Character.toUpperCase(c));
            }else {
                sb.append(Character.toLowerCase(c));
            }
        }
        return sb.toString();
    }
}