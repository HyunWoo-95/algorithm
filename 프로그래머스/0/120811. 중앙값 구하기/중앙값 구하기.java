import java.util.*;
class Solution {
    public int solution(int[] array) {
        // 배열의 중간 값을 찾을때는 배열의 길이 /2 를 하자
        int answer = 0;
        Arrays.sort(array);
        answer = array[array.length /2];
        return answer;
    }
}