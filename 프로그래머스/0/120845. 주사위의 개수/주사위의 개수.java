class Solution {
    public int solution(int[] box, int n) {
        int answer = 0;
        // int n1 = box[0] / n;
        // int n2 = box[1] / n;
        // int n3 = box[2] / n;
        // answer = n1 * n2 * n3;
        int sum = 1;
        answer = sum;
        for (int i = 0; i < box.length; i++){
            answer *= box[i] /n;
        }
        return answer;
    }
}