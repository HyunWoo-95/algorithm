class Solution {
    public int[] solution(long n) {
        String str = ""+n;
        int idx= 0;
        char[] array = str.toCharArray();
        int[] answer = new int[str.length()];
        for(int i = array.length-1; i >= 0; i--){
            answer[idx] = array[i] - '0';
            idx++;
        }
        return answer;
    }
}