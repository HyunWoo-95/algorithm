import java.util.*;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.Comparator;
class Solution {
    public String solution(String s) {
        // String[] strList =s.split(""); 
        // Arrays.sort(strList, Collections.reverseOrder());
        // StringBuilder sb = new StringBuilder();
        // for(String str : strList){
        //     sb.append(str);
        // }
        // return sb.toString();
        return Stream.of(s.split(""))
            .sorted(Comparator.reverseOrder())
            .collect(Collectors.joining());
    }
}