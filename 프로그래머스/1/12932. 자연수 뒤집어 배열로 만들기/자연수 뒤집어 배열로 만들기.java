class Solution {
    public int[] solution(long n) {
    //     String str = ""+n;
    //     int idx= 0;
    //     char[] array = str.toCharArray();
    //     int[] answer = new int[str.length()];
    //     for(int i = array.length-1; i >= 0; i--){
    //         answer[idx] = array[i] - '0';
    //         idx++;
    //     }
    //     return answer;
    // }
        String str = String.valueOf(n);
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        String[] arr = sb.toString().split("");
        int[] answer = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            answer[i] = Integer.parseInt(arr[i]);
        }
        return answer;
    }
}