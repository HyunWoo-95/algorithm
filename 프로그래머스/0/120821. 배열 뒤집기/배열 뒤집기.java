import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        List<Integer> res = Arrays.stream(num_list).boxed().collect(Collectors.toList());
        
        Collections.reverse(res);
        return res.stream().mapToInt(Integer::intValue).toArray();
    }
}