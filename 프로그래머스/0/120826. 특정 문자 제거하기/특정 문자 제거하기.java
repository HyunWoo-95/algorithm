import java.util.*;
class Solution {
    public String solution(String my_string, String letter) {
//         StringBuffer br = new StringBuffer();
//         char[] array = my_string.toCharArray();
        
//         for(int i = 0; i < array.length; i++){
//             if(array[i] != letter.charAt(0)){
//                 br.append(array[i]);
//             }
//         }
        
//         return br.toString();
        String answer = "";
        answer = my_string.replace(letter, "");
        return answer;
    }
}