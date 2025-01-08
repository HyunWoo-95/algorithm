class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        for(int i = 0; i < n; i++){
            // | 자바 비트 연산자로 두 비트 중 하나라도 1이면 1을 반환
            // Ex. (0101 | 0011) -> 0111
            answer[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
        }
        for(int i = 0; i < n; i++){
            // format로 % 포맷 지정자의 시작, s는 문자열 타입
            // answer[i]를 n 길이 만큼 오른쪽으로 정렬해 추가 공백을 앞에 채움
            answer[i] = String.format("%" + n + "s", answer[i]);
            answer[i] = answer[i].replaceAll("1","#").replaceAll("0"," ");
            }
        return answer;
    }
}