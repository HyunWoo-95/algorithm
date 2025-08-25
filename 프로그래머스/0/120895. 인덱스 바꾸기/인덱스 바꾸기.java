class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        // String[] arr = my_string.split("");
        // String tmp = "";
        // tmp = arr[num1];
        // arr[num1] = arr[num2];
        // arr[num2] = tmp;
        // answer = String.join("", arr);
        // return answer;
        char[] arr = my_string.toCharArray();
        
        arr[num1] = my_string.charAt(num2);
        arr[num2] = my_string.charAt(num1);
        
        answer = String.valueOf(arr);
        return answer;
    }
}