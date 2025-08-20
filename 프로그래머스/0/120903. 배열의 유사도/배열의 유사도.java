import java.util.*;
class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        // List<String> s2List = Arrays.asList(s2);
        // for(String s : s1){
        //     if(s2List.contains(s)){
        //         answer++;
        //     }
        // }
        for(String s : s1){
            if(Arrays.stream(s2).anyMatch(s::equals)){
                answer++;
            }
        }
        return answer;
    }
}