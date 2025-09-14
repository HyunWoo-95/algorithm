class Solution {
    public String solution(String my_string, int[] index_list) {
        // String answer = "";
        StringBuilder answer = new StringBuilder();
        String[] word = my_string.split("");
        for(int i = 0; i < index_list.length; i++){
            answer.append(word[index_list[i]]);
        }
        return answer.toString();
    }
}